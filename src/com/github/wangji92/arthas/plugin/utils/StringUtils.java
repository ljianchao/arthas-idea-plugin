package com.github.wangji92.arthas.plugin.utils;

import org.apache.commons.text.StringSubstitutor;

import java.util.Map;

/**
 * 首字母小写
 *
 * @author 汪小哥
 * @date 22-12-2019
 */
public class StringUtils extends org.apache.commons.lang3.StringUtils {

    /**
     * 首字母小写
     *
     * @param string
     * @return
     */
    public static String toLowerFristChar(String string) {
        if (Character.isLowerCase(string.charAt(0))) {
            return string;
        } else {
            char[] charArray = string.toCharArray();
            charArray[0] += 32;
            return String.valueOf(charArray);
        }
    }

    /**
     * common-text 字符串模板替换
     *
     * @param filePath
     * @param param
     * @return
     */
    public static String stringSubstitutor(String filePath, Map<String, String> param) {
        String templateString = IoUtils.getResourceFile(filePath);
        StringSubstitutor stringSubstitutor = new StringSubstitutor(param);
        //key value 字符串替换
        return stringSubstitutor.replace(templateString);
    }


}
