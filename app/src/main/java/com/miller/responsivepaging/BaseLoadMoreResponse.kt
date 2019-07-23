package com.miller.responsivepaging

/**
 * Created by Hoang Trung on 18/07/2019
 */

interface BaseLoadMoreResponse<T> {
    fun getListData(): List<T>
}