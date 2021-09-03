/*
 *   Copyright 2021. Explore in HMS. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.hmscl.huawei.admob_mediation.NativeAds

import android.graphics.drawable.Drawable
import android.net.Uri
import com.google.android.gms.ads.formats.NativeAd
import com.huawei.hms.ads.Image

class HuaweiCustomEventNativeAdsImageMapper(private val icon: Image): NativeAd.Image() {
    override fun getDrawable(): Drawable {
        return icon.drawable
    }

    override fun getUri(): Uri {
        return icon.uri
    }

    override fun getScale(): Double {
        return icon.scale
    }

    override fun getWidth(): Int {
        return icon.width
    }

    override fun getHeight(): Int {
        return icon.height
    }
}