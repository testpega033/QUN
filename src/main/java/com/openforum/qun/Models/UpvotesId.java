package com.openforum.qun.Models;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UpvotesId implements Serializable {
    private int ans_id;
    private String user_id;

    public UpvotesId(int ans_id, String user_id) {
        this.ans_id = ans_id;
        this.user_id = user_id;
    }

    public UpvotesId() {
    }

    public int getAns_id() {
        return ans_id;
    }

    public void setAns_id(int ans_id) {
        this.ans_id = ans_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UpvotesId)) return false;
        UpvotesId that = (UpvotesId) o;
        return Objects.equals(getAns_id(), that.getAns_id()) &&
                Objects.equals(getUser_id(), that.getUser_id());
    }

    @Override
    public int hashCode() {
        return (int) user_id.hashCode() + ans_id;

    }
}
