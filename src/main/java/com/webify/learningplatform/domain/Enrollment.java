package com.webify.learningplatform.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="web_enrollment", schema="project")
public class Enrollment {
	
	public Enrollment() {
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(updatable = false, nullable = false)
	private Long enrollment_id;
	
	@ManyToOne
	@JoinColumn(name="course_id")
	private Course courseEnrollment;
	
	@JoinColumn(name="student_id")
	private Long student_id;

	public Long getEnrollment_id() {
		return enrollment_id;
	}

	public void setEnrollment_id(Long enrollment_id) {
		this.enrollment_id = enrollment_id;
	}

	public Course getCourseEnrollment() {
		return courseEnrollment;
	}

	public void setCourseEnrollment(Course courseEnrollment) {
		this.courseEnrollment = courseEnrollment;
	}

	public Long getStudent_id() {
		return student_id;
	}

	public void setStudent_id(Long student_id) {
		this.student_id = student_id;
	}

	public Enrollment(Long enrollment_id, Course courseEnrollment, Long student_id) {
		super();
		this.enrollment_id = enrollment_id;
		this.courseEnrollment = courseEnrollment;
		this.student_id = student_id;
	}

	@Override
	public String toString() {
		return "Enrollment [enrollment_id=" + enrollment_id + ", courseEnrollment=" + courseEnrollment + ", student_id="
				+ student_id + "]";
	}

	
	
}
