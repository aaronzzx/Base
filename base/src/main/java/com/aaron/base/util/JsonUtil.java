package com.aaron.base.util;

import androidx.annotation.NonNull;
import com.blankj.utilcode.util.GsonUtils;

import java.lang.reflect.Type;

/**
 * @author Aaron aaronzheng9603@gmail.com
 */
public final class JsonUtil {

    public static <T> T fromJson(String json, @NonNull Class<T> type) {
        return GsonUtils.fromJson(json, type);
    }

    public static <T> T fromJson(String json, @NonNull Type type) {
        return GsonUtils.fromJson(json, type);
    }

    public static String toJson(Object obj) {
        return GsonUtils.toJson(obj, true);
    }

    private JsonUtil() {

    }
}