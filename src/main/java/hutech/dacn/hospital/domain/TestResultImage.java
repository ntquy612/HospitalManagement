package hutech.dacn.hospital.domain;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "TestResultImage")
public class TestResultImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long testResultImageId;

    @ManyToOne
    @JoinColumn(name = "testIssueResultId")
    private TestIssueResult testIssueResult;

    @ManyToOne
    @JoinColumn(name = "imageId")
    private Image image;

    // Audit fields
    private String createUser;
    private Date createDate;
    private String updateUser;
    private Date updateDate;

    // Getters and setters
}
