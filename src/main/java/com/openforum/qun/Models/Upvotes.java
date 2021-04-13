package com.openforum.qun.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.OffsetDateTime;

@Entity
@Table(name = "Upvotes")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Getter
@Setter
@IdClass(UpvotesId.class)
public class Upvotes implements Serializable {

    @EmbeddedId
    private  UpvotesId upvotesId;

    @CreationTimestamp
    private OffsetDateTime createdatetime;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "upvotes")
    private Answers answers;


}
