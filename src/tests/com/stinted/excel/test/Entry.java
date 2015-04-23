
package com.stinted.excel.test;

import java.util.ArrayList;
import java.util.List;

public class Entry {

    private long id;
    private Object external_id;
    private String blurb;
    private long priority;
    private Object locked_until;
    private List<Object> label_ids = new ArrayList<Object>();
    private Object active_at;
    private String changed_at;
    private String created_at;
    private String updated_at;
    private Object first_opened_at;
    private Object opened_at;
    private Object first_resolved_at;
    private Object resolved_at;
    private String status;
    private long active_notes_count;
    private long active_attachments_count;
    private boolean has_pending_interactions;
    private boolean has_failed_interactions;
    private Object description;
    private String language;
    private String received_at;
    private String type;
    private List<Object> labels = new ArrayList<Object>();
    private String subject;

    /**
     * 
     * @return
     *     The id
     */
    public long getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(long id) {
        this.id = id;
    }

    public Entry withId(long id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The external_id
     */
    public Object getExternal_id() {
        return external_id;
    }

    /**
     * 
     * @param external_id
     *     The external_id
     */
    public void setExternal_id(Object external_id) {
        this.external_id = external_id;
    }

    public Entry withExternal_id(Object external_id) {
        this.external_id = external_id;
        return this;
    }

    /**
     * 
     * @return
     *     The blurb
     */
    public String getBlurb() {
        return blurb;
    }

    /**
     * 
     * @param blurb
     *     The blurb
     */
    public void setBlurb(String blurb) {
        this.blurb = blurb;
    }

    public Entry withBlurb(String blurb) {
        this.blurb = blurb;
        return this;
    }

    /**
     * 
     * @return
     *     The priority
     */
    public long getPriority() {
        return priority;
    }

    /**
     * 
     * @param priority
     *     The priority
     */
    public void setPriority(long priority) {
        this.priority = priority;
    }

    public Entry withPriority(long priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 
     * @return
     *     The locked_until
     */
    public Object getLocked_until() {
        return locked_until;
    }

    /**
     * 
     * @param locked_until
     *     The locked_until
     */
    public void setLocked_until(Object locked_until) {
        this.locked_until = locked_until;
    }

    public Entry withLocked_until(Object locked_until) {
        this.locked_until = locked_until;
        return this;
    }

    /**
     * 
     * @return
     *     The label_ids
     */
    public List<Object> getLabel_ids() {
        return label_ids;
    }

    /**
     * 
     * @param label_ids
     *     The label_ids
     */
    public void setLabel_ids(List<Object> label_ids) {
        this.label_ids = label_ids;
    }

    public Entry withLabel_ids(List<Object> label_ids) {
        this.label_ids = label_ids;
        return this;
    }

    /**
     * 
     * @return
     *     The active_at
     */
    public Object getActive_at() {
        return active_at;
    }

    /**
     * 
     * @param active_at
     *     The active_at
     */
    public void setActive_at(Object active_at) {
        this.active_at = active_at;
    }

    public Entry withActive_at(Object active_at) {
        this.active_at = active_at;
        return this;
    }

    /**
     * 
     * @return
     *     The changed_at
     */
    public String getChanged_at() {
        return changed_at;
    }

    /**
     * 
     * @param changed_at
     *     The changed_at
     */
    public void setChanged_at(String changed_at) {
        this.changed_at = changed_at;
    }

    public Entry withChanged_at(String changed_at) {
        this.changed_at = changed_at;
        return this;
    }

    /**
     * 
     * @return
     *     The created_at
     */
    public String getCreated_at() {
        return created_at;
    }

    /**
     * 
     * @param created_at
     *     The created_at
     */
    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public Entry withCreated_at(String created_at) {
        this.created_at = created_at;
        return this;
    }

    /**
     * 
     * @return
     *     The updated_at
     */
    public String getUpdated_at() {
        return updated_at;
    }

    /**
     * 
     * @param updated_at
     *     The updated_at
     */
    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public Entry withUpdated_at(String updated_at) {
        this.updated_at = updated_at;
        return this;
    }

    /**
     * 
     * @return
     *     The first_opened_at
     */
    public Object getFirst_opened_at() {
        return first_opened_at;
    }

    /**
     * 
     * @param first_opened_at
     *     The first_opened_at
     */
    public void setFirst_opened_at(Object first_opened_at) {
        this.first_opened_at = first_opened_at;
    }

    public Entry withFirst_opened_at(Object first_opened_at) {
        this.first_opened_at = first_opened_at;
        return this;
    }

    /**
     * 
     * @return
     *     The opened_at
     */
    public Object getOpened_at() {
        return opened_at;
    }

    /**
     * 
     * @param opened_at
     *     The opened_at
     */
    public void setOpened_at(Object opened_at) {
        this.opened_at = opened_at;
    }

    public Entry withOpened_at(Object opened_at) {
        this.opened_at = opened_at;
        return this;
    }

    /**
     * 
     * @return
     *     The first_resolved_at
     */
    public Object getFirst_resolved_at() {
        return first_resolved_at;
    }

    /**
     * 
     * @param first_resolved_at
     *     The first_resolved_at
     */
    public void setFirst_resolved_at(Object first_resolved_at) {
        this.first_resolved_at = first_resolved_at;
    }

    public Entry withFirst_resolved_at(Object first_resolved_at) {
        this.first_resolved_at = first_resolved_at;
        return this;
    }

    /**
     * 
     * @return
     *     The resolved_at
     */
    public Object getResolved_at() {
        return resolved_at;
    }

    /**
     * 
     * @param resolved_at
     *     The resolved_at
     */
    public void setResolved_at(Object resolved_at) {
        this.resolved_at = resolved_at;
    }

    public Entry withResolved_at(Object resolved_at) {
        this.resolved_at = resolved_at;
        return this;
    }

    /**
     * 
     * @return
     *     The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    public Entry withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 
     * @return
     *     The active_notes_count
     */
    public long getActive_notes_count() {
        return active_notes_count;
    }

    /**
     * 
     * @param active_notes_count
     *     The active_notes_count
     */
    public void setActive_notes_count(long active_notes_count) {
        this.active_notes_count = active_notes_count;
    }

    public Entry withActive_notes_count(long active_notes_count) {
        this.active_notes_count = active_notes_count;
        return this;
    }

    /**
     * 
     * @return
     *     The active_attachments_count
     */
    public long getActive_attachments_count() {
        return active_attachments_count;
    }

    /**
     * 
     * @param active_attachments_count
     *     The active_attachments_count
     */
    public void setActive_attachments_count(long active_attachments_count) {
        this.active_attachments_count = active_attachments_count;
    }

    public Entry withActive_attachments_count(long active_attachments_count) {
        this.active_attachments_count = active_attachments_count;
        return this;
    }

    /**
     * 
     * @return
     *     The has_pending_interactions
     */
    public boolean isHas_pending_interactions() {
        return has_pending_interactions;
    }

    /**
     * 
     * @param has_pending_interactions
     *     The has_pending_interactions
     */
    public void setHas_pending_interactions(boolean has_pending_interactions) {
        this.has_pending_interactions = has_pending_interactions;
    }

    public Entry withHas_pending_interactions(boolean has_pending_interactions) {
        this.has_pending_interactions = has_pending_interactions;
        return this;
    }

    /**
     * 
     * @return
     *     The has_failed_interactions
     */
    public boolean isHas_failed_interactions() {
        return has_failed_interactions;
    }

    /**
     * 
     * @param has_failed_interactions
     *     The has_failed_interactions
     */
    public void setHas_failed_interactions(boolean has_failed_interactions) {
        this.has_failed_interactions = has_failed_interactions;
    }

    public Entry withHas_failed_interactions(boolean has_failed_interactions) {
        this.has_failed_interactions = has_failed_interactions;
        return this;
    }

    /**
     * 
     * @return
     *     The description
     */
    public Object getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(Object description) {
        this.description = description;
    }

    public Entry withDescription(Object description) {
        this.description = description;
        return this;
    }

    /**
     * 
     * @return
     *     The language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * 
     * @param language
     *     The language
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    public Entry withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * 
     * @return
     *     The received_at
     */
    public String getReceived_at() {
        return received_at;
    }

    /**
     * 
     * @param received_at
     *     The received_at
     */
    public void setReceived_at(String received_at) {
        this.received_at = received_at;
    }

    public Entry withReceived_at(String received_at) {
        this.received_at = received_at;
        return this;
    }

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    public Entry withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 
     * @return
     *     The labels
     */
    public List<Object> getLabels() {
        return labels;
    }

    /**
     * 
     * @param labels
     *     The labels
     */
    public void setLabels(List<Object> labels) {
        this.labels = labels;
    }

    public Entry withLabels(List<Object> labels) {
        this.labels = labels;
        return this;
    }

    /**
     * 
     * @return
     *     The subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * 
     * @param subject
     *     The subject
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Entry withSubject(String subject) {
        this.subject = subject;
        return this;
    }
}