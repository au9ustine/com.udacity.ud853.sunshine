/*
 * Copyright 2015 Shao Tian-Chen (Austin)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.sunshine.app.data;

import android.provider.BaseColumns;

/**
 * Data Contract for Weather
 *
 * Created by shaotch on 2/8/2015.
 */
public class WeatherContract {

    // Define Weather Content of table
    public static final class WeatherEntry implements BaseColumns {
        public static final String TABLE_NAME = "weather";

    }
}
