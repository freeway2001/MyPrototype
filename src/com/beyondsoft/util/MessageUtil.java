/*
 * Copyright 1999-2101 Alibaba Group.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 	http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.beyondsoft.util;

import android.content.Context;
import android.widget.Toast;

/**
 * Wrapper of Toast
 * Date: 12-8-29
 * Time: 下午3:08
 *
 * @author zhe.yangz
 */
public class MessageUtil {
    public static void showLongToast(Context context, int res) {
        try {
            Toast.makeText(context, res, Toast.LENGTH_LONG).show();
        } catch (Exception e) {};
    }

    public static void showShortToast(Context context, int res) {
        try{
            Toast.makeText(context, res, Toast.LENGTH_SHORT).show();
        } catch (Exception e) {};

    }

    public static void showLongToast(Context context, String text) {
        try {
            Toast.makeText(context, text, Toast.LENGTH_LONG).show();
        } catch (Exception e) {};
    }

    public static void showShortToast(Context context, String text) {
        try{
            Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
        } catch (Exception e) {};

    }
}
