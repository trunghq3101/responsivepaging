package com.miller.responsivepaging

import androidx.lifecycle.LiveData
import androidx.paging.PagedList

/**
 * Created by Hoang Trung on 15/07/2019
 */

data class Listing<T: BaseLoadMoreEntity>(
    val pagedList: LiveData<PagedList<T>>,
    val networkState: LiveData<NetworkState>
)