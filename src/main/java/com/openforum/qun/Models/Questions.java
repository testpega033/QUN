package com.openforum.qun.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.OffsetDateTime;
import java.util.UUID;

@Entity
@Table(name="Questions")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Questions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int qn_id;
    private String qn;
    @Type(type = "pg-uuid")
    private UUID qn_uuid= UUID.randomUUID();
    @CreationTimestamp
    private OffsetDateTime createdatetime;
    @UpdateTimestamp
    private OffsetDateTime updatedatetime;

    public int getQn_id() {
        return qn_id;
    }

    public void setQn_id(int qn_id) {
        this.qn_id = qn_id;
    }

    public String getQn() {
        return qn;
    }

    public void setQn(String qn) {
        this.qn = qn;
    }

    public UUID getQn_uuid() {
        return qn_uuid;
    }

    public void setQn_uuid(UUID qn_uuid) {
        this.qn_uuid = qn_uuid;
    }

    public OffsetDateTime getCreatedatetime() {
        return createdatetime;
    }

    public void setCreatedatetime(OffsetDateTime createdatetime) {
        this.createdatetime = createdatetime;
    }

    public OffsetDateTime getUpdatedatetime() {
        return updatedatetime;
    }

    public void setUpdatedatetime(OffsetDateTime updatedatetime) {
        this.updatedatetime = updatedatetime;
    }
}
