package com.globalLogic.model;

public class Education {
	private String degree;
	private String percent;
	private String date;

	
	
    public Education() {
		super();
	}

    
	public Education(String degree, String percent, String date) {
		super();
		this.degree = degree;
		this.percent = percent;
		this.date = date;
	}


	public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getPercent() {
        return percent;
    }

    public void setPercent(String percent) {
        this.percent = percent;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
