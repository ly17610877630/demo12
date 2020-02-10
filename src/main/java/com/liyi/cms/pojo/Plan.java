package com.liyi.cms.pojo;

public class Plan {
	private Integer id;
	private String name;
	private String amout;
	private String manger;
	private String content;
	private Integer did;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAmout() {
		return amout;
	}
	public void setAmout(String amout) {
		this.amout = amout;
	}
	public String getManger() {
		return manger;
	}
	public void setManger(String manger) {
		this.manger = manger;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	@Override
	public String toString() {
		return "Plan [id=" + id + ", name=" + name + ", amout=" + amout + ", manger=" + manger + ", content=" + content
				+ ", did=" + did + "]";
	}
	public Plan(Integer id, String name, String amout, String manger, String content, Integer did) {
		super();
		this.id = id;
		this.name = name;
		this.amout = amout;
		this.manger = manger;
		this.content = content;
		this.did = did;
	}
	public Plan() {
		super();
	}
}
