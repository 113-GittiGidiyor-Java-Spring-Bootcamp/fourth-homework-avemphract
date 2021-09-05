package dev.patika.fourthhomeworkavemphract.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class ErrorEntity extends BaseEntity {
    private String errorMessage;
    private int errorCode;
}
