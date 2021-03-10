package com.chinook.store.api.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter @Setter @NoArgsConstructor
@Entity
@Table(name = "Artist")
public class ArtistModel {

    @Id
    @Column(name = "ArtistId")
    private Integer artistId;

    @Column(name = "Name")
    private String name;

}
