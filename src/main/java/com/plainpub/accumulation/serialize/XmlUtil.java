package com.plainpub.accumulation.serialize;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public final class XmlUtil {
    private XmlUtil() {
    }


    public static <T> T toObject(String xml, Class<T> modelType) throws JsonProcessingException {
        XmlMapper xmlMapper = new XmlMapper();
        T instance = xmlMapper.readValue(xml, modelType);

        return instance;
    }

}
