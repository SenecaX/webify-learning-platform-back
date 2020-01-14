package com.webify.learningplatform.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="web_course", schema="project")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(updatable = false, nullable = false)
	private Long course_id;
	
	@Column(name="course_name")
	private String course_name;
	
	@Column(name="description")
	private String description;
	
	@Column(name="img_url")
	private String img_url;
	
	@Column(name="course_level")
	private String course_level;
	
	public String getImg_url() {
		return img_url;
	}

	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}

	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern="yyyy-MM-dd")
	@Column(name="created_on")
	private Date created_on;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	public Course() {
	}

	public Long getCourse_id() {
		return course_id;
	}

	public void setCourse_id(Long course_id) {
		this.course_id = course_id;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreated_on() {
		return created_on;
	}

	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	

	public String getCourse_level() {
		return course_level;
	}

	public void setCourse_level(String course_level) {
		this.course_level = course_level;
	}

	
	
	public Course(Long course_id, String course_name, String description, String img_url, String course_level,
			Date created_on, User user, List<Module> courses, List<Lecture> modules, List<Enrollment> courseEnrollments,
			List<Quiz> courseQuizzes) {
		super();
		this.course_id = course_id;
		this.course_name = course_name;
		this.description = description;
		this.img_url = img_url;
		this.course_level = course_level;
		this.created_on = created_on;
		this.user = user;
		this.courses = courses;
		this.modules = modules;
		this.courseEnrollments = courseEnrollments;
		this.courseQuizzes = courseQuizzes;
	}

	@Override
	public String toString() {
		return "Course [course_id=" + course_id + ", course_name=" + course_name + ", description=" + description
				+ ", img_url=" + img_url + ", course_level=" + course_level + ", created_on=" + created_on + ", user="
				+ user + ", courses=" + courses + ", modules=" + modules + ", courseEnrollments=" + courseEnrollments
				+ ", courseQuizzes=" + courseQuizzes + "]";
	}

	@OneToMany(mappedBy = "course")
	private List<Module> courses = new ArrayList<Module>();
	
	public void addModule(Module module) {
		this.courses.add(module);
		module.setCourse(this);
	}
	
	@OneToMany(mappedBy = "courseLecture")
	private List<Lecture> modules = new ArrayList<Lecture>();
	
	public void addCourseLecture(Lecture courseLecture) {
		this.modules.add(courseLecture);
		courseLecture.setCourseLecture(this);
	}
	
	@OneToMany(mappedBy = "courseEnrollment")
	private List<Enrollment> courseEnrollments = new ArrayList<Enrollment>();
	
	public void addCourseEnrollment(Enrollment courseEnrollment) {
		this.courseEnrollments.add(courseEnrollment);
		courseEnrollment.setCourseEnrollment(this);
	}
	
	
//	@OneToMany(mappedBy = "courseQuizAnswer")
//	private List<UserQuizAnswer> courseQuizAnswers = new ArrayList<UserQuizAnswer>();
//	
//	public void addUserQuizAnswer(UserQuizAnswer courseQuizAnswer) {
//		this.courseQuizAnswers.add(courseQuizAnswer);
//		courseQuizAnswer.setCourseQuizAnswer(this);
//	}	
	
	@OneToMany(mappedBy = "courseQuiz")
	private List<Quiz> courseQuizzes = new ArrayList<Quiz>();
	
	public void addCourseQuiz(Quiz courseQuiz) {
		this.courseQuizzes.add(courseQuiz);
		courseQuiz.setCourseQuiz(this);
	}
}
