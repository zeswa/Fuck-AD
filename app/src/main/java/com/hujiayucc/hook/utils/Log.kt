package com.hujiayucc.hook.utils

import com.highcapable.yukihookapi.hook.log.loggerD
import com.highcapable.yukihookapi.hook.log.loggerE
import com.highcapable.yukihookapi.hook.log.loggerI
import com.highcapable.yukihookapi.hook.log.loggerW
import com.hujiayucc.hook.data.DataConst.TAG

object Log {
    fun d(msg: String) {
        loggerD(TAG, "------$msg------")
    }

    fun e(msg: String) {
        loggerE(TAG, "------$msg------")
    }

    fun i(msg: String) {
        loggerI(TAG, "------$msg------")
    }

    fun w(msg: String) {
        loggerW(TAG, "------$msg------")
    }
}