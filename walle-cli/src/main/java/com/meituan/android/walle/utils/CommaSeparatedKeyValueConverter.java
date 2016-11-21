package com.meituan.android.walle.utils;

import com.beust.jcommander.IStringConverter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by chentong on 21/11/2016.
 */

public class CommaSeparatedKeyValueConverter implements IStringConverter<Map<String, String>> {
    @Override
    public Map<String, String> convert(String value) {
        Map<String, String> result = null;
        if (!Util.isTextEmpty(value)) {
            String[] temp = value.split(",");
            result = new HashMap<>(temp.length);
            for (String s : temp) {
                String[] keyValue = s.split("=");
                if (keyValue.length == 2) {
                    result.put(keyValue[0], keyValue[1]);
                }
            }
        }
        return result;
    }
}
