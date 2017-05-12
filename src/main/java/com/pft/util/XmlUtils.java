
 /**
 * Project Name:pft-xml
 * File Name:XmlUstils.java
 * Package Name:com.pft.util
 * Date:2017年5月12日上午11:08:33
 * Copyright (c) 2017, lijian@12301.cc All Rights Reserved.
*/

package com.pft.util;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ClassName:XmlUstils <br/>
 * Reason:	 xml转化工具 <br/>
 * Date:     2017年5月12日 上午11:08:33 <br/>
 * @author   lijian@12301.cc
 * @version  V0.1
 * @since    JDK 1.8
 * @see 	 
 */
public class XmlUtils {
	protected final static Logger logger = LoggerFactory.getLogger(XmlUtils.class);
	/**
	 * 将实体信息转化成xml
	 * @author lijian@12301.cc
	 * @param domain 实体
	 * @param encoding 编码
	 * @return String xml信息
	 * @since JDK 1.8
	 */
	public static String convertToXml(Object domain, String encoding) {
		String result = null;
		try {
			JAXBContext context = JAXBContext.newInstance(domain.getClass());
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.setProperty(Marshaller.JAXB_ENCODING, encoding);

			StringWriter writer = new StringWriter();
			marshaller.marshal(domain, writer);
			result = writer.toString();
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("convertToXml error "+e.getMessage());
		}
		return result;
	}
	/**
	 * 将xml转化成实体信息
	 * @author lijian@12301.cc
	 * @param xml
	 * @param domain 实体信息
	 * @return 实体信息
	 * @since JDK 1.8
	 */
	@SuppressWarnings("unchecked")
	public static <T> T convertToJavaBean(String xml, Class<T> domain) {
		T t = null;
		try {
			JAXBContext context = JAXBContext.newInstance(domain);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			t = (T) unmarshaller.unmarshal(new StringReader(xml));
		} catch (Exception e) {
			logger.error("converyToJavaBean error "+e.getMessage());
		}
		return t;
	}
}

