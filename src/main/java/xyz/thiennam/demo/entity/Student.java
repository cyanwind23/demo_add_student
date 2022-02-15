package xyz.thiennam.demo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "thiennam_student")
@Table(name = "demo_student")
public class Student {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "ID", updatable = false, nullable = false, unique = true)
    private UUID id;

    @Column(name = "code", updatable = false, nullable = false, unique = true)
    private String code;

    @Column(name = "name")
    private String name;

    @Column(name = "dob")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dob;

    @Column(name = "gender")
    private Boolean gender;

    @Column(name = "class_code")
    private String classCode;
}
