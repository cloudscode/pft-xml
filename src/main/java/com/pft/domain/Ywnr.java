
 /**
 * Project Name:pft-xml
 * File Name:Ywnr.java
 * Package Name:com.pft.test
 * Date:2017年5月12日上午11:03:35
 * Copyright (c) 2017, lijian@12301.cc All Rights Reserved.
*/

package com.pft.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * ClassName:Ywnr <br/>
 * Reason:	 TODO <br/>
 * Date:     2017年5月12日 上午11:03:35 <br/>
 * @author   lijian@12301.cc
 * @version  V0.1
 * @since    JDK 1.8
 * @see 	 
 */
@XmlAccessorType(XmlAccessType.FIELD)  
@XmlRootElement(name = "")  
public class Ywnr {

	private BWRequest request;

	public BWRequest getRequest() {
		return request;
	}

	public void setRequest(BWRequest request) {
		this.request = request;
	}
}

