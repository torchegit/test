package com.internousdev.webproj4.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.webproj4.dao.InquiryCompleteDAO;
import com.internousdev.webproj4.dto.InquiryDTO;
import com.opensymphony.xwork2.ActionSupport;

public class InquiryCompleteAction extends ActionSupport {

	private String name;
	private String qtype;
	private String body;

	List<InquiryDTO> inquiryDTOList = new ArrayList<InquiryDTO>();

	public String execute() {
		String ret=ERROR;
		InquiryCompleteDAO dao=new InquiryCompleteDAO();
		int count=dao.insert(name, qtype, body);
		if(count > 0){
			inquiryDTOList=dao.select();


		ret=SUCCESS;
		}
		return ret;
	}
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 8f26d54d721b2735f584208d3a8d591d1b0c1c58

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQtype() {
		return qtype;
	}

	public void setQtype(String qtype) {
		this.qtype = qtype;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public List<InquiryDTO> getInquiryDTOList() {
		return inquiryDTOList;
	}

	public void setInquiryDTOList(List<InquiryDTO> inquiryDTOList) {
		this.inquiryDTOList = inquiryDTOList;
	}
<<<<<<< HEAD
=======
=======
>>>>>>> 7ee33564aa18078133ae73c7015b9ce16c3cf728
>>>>>>> 8f26d54d721b2735f584208d3a8d591d1b0c1c58
}
