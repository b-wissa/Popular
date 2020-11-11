object Versions {
    const val rx_kotlin2_version = "2.4.0"
    const val rx_java_android_version = "2.1.0"
    const val koin_version = "2.0.1"
    const val retrofit2_version = "2.6.1"
    const val arrow_version = "0.9.0"
    const val multidex_version = "2.0.1"
    const val recycler_view_version = "1.0.0"
    const val card_view_version = "1.0.0"
    const val mockito_kotlin_version = "2.1.0"
    const val arch_components_testing = "2.1.0"
    const val glide_version = "4.9.0"
}

object Libs {
    const val rx_kotlin2 = "io.reactivex.rxjava2:rxkotlin:${Versions.rx_kotlin2_version}"
    const val koin = "org.koin:koin-android:${Versions.koin_version}"
    const val koin_viewmodel = "org.koin:koin-androidx-viewmodel:${Versions.koin_version}"
    const val retrofit2 = "com.squareup.retrofit2:retrofit:${Versions.retrofit2_version}"
    const val retrofit2_gson_converter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit2_version}"
    const val retrofit2_rx2_adapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.rx_kotlin2_version}"
    const val arrow_core_data = "io.arrow-kt:arrow-core-data:${Versions.arrow_version}"
    const val multi_dex = "androidx.multidex:multidex:${Versions.multidex_version}"
    const val recycler_view = "androidx.recyclerview:recyclerview:${Versions.recycler_view_version}"
    const val card_view = "androidx.cardview:cardview:${Versions.card_view_version}"
    const val mockito_kotlin = "com.nhaarman.mockitokotlin2:mockito-kotlin:${Versions.mockito_kotlin_version}"
    const val arch_components_test = "androidx.arch.core:core-testing:${Versions.arch_components_testing}"
    const val rx2_android = "io.reactivex.rxjava2:rxandroid:${Versions.rx_java_android_version}"
    const val glide = "com.github.bumptech.glide:glide:${Versions.glide_version}"
}