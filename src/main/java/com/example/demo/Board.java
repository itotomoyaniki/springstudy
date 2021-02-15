package com.example.demo;

import java.sql.Timestamp;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="day23db")
public class Board {
	@Id @GeneratedValue(strategy = GenerationType.AUTO) @Column(name="id")
	private long id;
	
//　エラーの種類を選別　パターンを作る　バリデーションをアップデート
//	MySQLを使っての管理　環境構築をする。
//　１対多の概念を知る　実装する
	@Column(name="name")
	@NotBlank(message="")
	@Size(min=2,max=20,message="名前は2文字以上20字以内で入力してください")
	private String name;
	
	@Column(name="message")
	@NotBlank(message="")
	@Size(min=1,max=1000,message="投稿内容は1文字以上1000文字以内で入力してください")
	private String mail;

	@Column(name="clock")
	private String clock;
	
	
	
	public long getId() { return id; }
	public void setid(long id) { this.id = id; }
	
	public String getClock() {return clock;}
	public void setClock(String clock) {this.clock=clock;}
	
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	public String getMail() { return mail; }
	public void setMail(String mail) { this.mail = mail; }
	
//	@OneToMany(mappedBy="user")
//	private List<Boardtable> boardList;
//	public List<Boardtable> getList() {return boardList;}
//	public void setList(List boardList) {this.boardList=boardList;}
//	
	
	public Object getFieldErrors() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
