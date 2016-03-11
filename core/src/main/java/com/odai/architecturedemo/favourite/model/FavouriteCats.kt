package com.odai.architecturedemo.favourite.model

import com.odai.architecturedemo.cat.model.Cat
import com.odai.architecturedemo.favourite.model.FavouriteState

class FavouriteCats(val favourites: Map<Cat, FavouriteState>) {

    fun put(p0: Pair<Cat, FavouriteState>): FavouriteCats {
        return FavouriteCats(favourites.plus(p0))
    }

    fun isEmpty(): Boolean {
        return favourites.isEmpty()
    }

    fun getStatusFor(cat: Cat): FavouriteState {
        if (favourites.containsKey(cat)) {
            return favourites[cat]!!
        } else {
            return FavouriteState.UN_FAVOURITE
        }
    }
}
