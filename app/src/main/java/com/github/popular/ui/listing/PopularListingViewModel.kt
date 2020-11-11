package com.github.popular.ui.listing

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.github.popular.utils.MilliSeconds
import com.github.popular.utils.exhaustive

import io.reactivex.disposables.CompositeDisposable
class PopularListingViewModel : ViewModel() {
    private val compositeDisposable = CompositeDisposable()
    private val mutableLiveData: MutableLiveData<States> = MutableLiveData()
    val liveData: LiveData<States> get() = mutableLiveData
    fun send(event: Events) {
        when (event) {
            is Events.OnAttach -> onAttach(event.pageSize, event.refreshMillis)
        }.exhaustive
    }

    private fun onAttach(pageSize: Int, refreshMillis: MilliSeconds) {
        mutableLiveData.value = States.Loading
    }

    sealed class Events {

        data class OnAttach(val pageSize: Int, val refreshMillis: MilliSeconds) : PopularListingViewModel.Events()
    }

    sealed class States {
        object Error : States()
        object Loading : States()
        data class PopularItems(val items: List<PopularRepoListItem>) : States()
    }

}
