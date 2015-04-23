package com.stinted.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import lombok.extern.log4j.Log4j;

import com.stinted.util.StringUtil;

@Log4j
public class ClassMapper {
	
	/**
	 * Monta lista de campos da classe
	 * @param clazz Class<?>
	 * @return fieldNames List<String>
	 * @throws Exception
	 */
	public List<String> getFieldsForClass(Class<?> clazz) throws Exception {
		List<String> fieldNames = new ArrayList<String>();
		Field[] fields = clazz.getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			fieldNames.add(fields[i].getName());
		}
		return fieldNames;
	}
	
	/**
	 * Avaliar qual a classe do retorno do método get de um campo
	 * @param clazz Class<?>
	 * @param fieldName String
	 * @return returnType Class<?>
	 */
	public Class<?> getGetterReturnClass(Class<?> clazz, String fieldName) {
		List<String> possibleGetters = new ArrayList<String>();
		possibleGetters.add("get" + StringUtil.capitalize(fieldName));
		possibleGetters.add("is" + StringUtil.capitalize(fieldName));
		
		Class<?> returnType = null;
		for (Method method : clazz.getMethods()) {
			if(possibleGetters.contains(method.getName())){
				returnType = method.getReturnType();
				break;
			}
		}
		
		/*
		String methodName = "get" + StringUtil.capitalize(fieldName);
		Class<?> returnType = null;
		for (Method method : clazz.getMethods()) {
			if(method.getName().equals(methodName)){
				returnType = method.getReturnType();
				break;
			}
		}
		*/
		return returnType;
	}
	
	/**
	 * Retorna método invocável da classe para atualizar o valor de um atributo
	 * @param clazz Class
	 * @param fieldName String
	 * @return method Method
	 * @throws SecurityException
	 * @throws NoSuchMethodException
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Method setMethod(Class clazz, String fieldName) throws SecurityException, NoSuchMethodException {
		Class<?> fieldClass = getGetterReturnClass(clazz, fieldName);
		Method method = null;
		try {
			method = clazz.getMethod("set" + StringUtil.capitalize(fieldName),fieldClass);
		} catch (NoSuchMethodException e) {
			log.error("NoSuchMethod: " + e.getMessage().endsWith("Logger(null)"));
			if(!e.getMessage().endsWith("Logger(null)")){
				throw e;
			}
		}
		return method;
	}
	
	/**
	 * Retorna método invocável da classe para resgatar o valor de um atributo
	 * @param clazz Class
	 * @param fieldName String
	 * @return method Method
	 * @throws SecurityException
	 * @throws NoSuchMethodException
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Method getMethod(Class clazz, String fieldName) throws SecurityException, NoSuchMethodException {
		Class<?> fieldClass = getGetterReturnClass(clazz, fieldName);
		Method method = null;
		
		try {
			String action = fieldClass.toString().equalsIgnoreCase("boolean") ? "is" : "get";
			method = clazz.getMethod(action + StringUtil.capitalize(fieldName));
		} catch (NoSuchMethodException e) {
			log.error("NoSuchMethod: " + e.getMessage().endsWith("Logger(null)"));
			if(!e.getMessage().endsWith("Logger(null)")){
				throw e;
			}
		}
		return method;
	}
}