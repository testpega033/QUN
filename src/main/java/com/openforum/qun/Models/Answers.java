package com.openforum.qun.Models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.OffsetDateTime;
import java.util.UUID;

@Entity
@Table(name = "Answers")
@AllArgsConstructor
@NoArgsConstructor
public class Answers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ans_id;
    private String ans;
    @Type(type = "pg-uuid")
    private UUID ans_uuid=UUID.randomUUID();
    @CreationTimestamp
    private OffsetDateTime createdatetime;
    @UpdateTimestamp
    private OffsetDateTime updatedatetime;

    public int getAns_id() {
        return ans_id;
    }

    public void setAns_id(int ans_id) {
        this.ans_id = ans_id;
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }

    public UUID getAns_uuid() {
        return ans_uuid;
    }

    public void setAns_uuid(UUID ans_uuid) {
        this.ans_uuid = ans_uuid;
    }

    public OffsetDateTime getCreatedatetime() {
        return createdatetime;
    }

    public void setCreatedatetime(OffsetDateTime createdatetime) {
        this.createdatetime = OffsetDateTime.now();
    }

    public OffsetDateTime getUpdatedatetime() {
        return updatedatetime;
    }

    public void setUpdatedatetime(OffsetDateTime updatedatetime) {
        this.updatedatetime = OffsetDateTime.now();
    }
}
