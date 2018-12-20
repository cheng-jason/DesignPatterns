package com.jason.designPatterns.proxy.person;

public class PersonBeanImpl implements PersonBean {
	String name, gender, interests;
	int rating, ratingCount = 0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getInterests() {
		return interests;
	}

	public void setInterests(String interests) {
		this.interests = interests;
	}

	public int getHotOrNotRating() {
		if (ratingCount == 0) {
			return 0;
		}
		return rating / ratingCount;
	}

	public void setHotOrNotRating(int hotOrNotRating) {
		if (hotOrNotRating < 0 || hotOrNotRating > 5) {
			System.out.println("评分在0-5分之间");
		} else {
			rating += hotOrNotRating;
			ratingCount++;
		}
	}
	
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append(" name is ");
		sb.append(this.getName());
		sb.append("\n interests is ");
		sb.append(this.getInterests());
		sb.append("\n gender is ");
		sb.append(this.getGender());
		sb.append("\n hotOrNotRating is ");
		sb.append(this.getHotOrNotRating());
		return sb.toString();
	}

}
