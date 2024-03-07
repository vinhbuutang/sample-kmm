plugins {
    //trick: for the same plugin versions in all sub-modules
//    id("com.android.application").version("8.0.2").apply(false)
//    kotlin("android").version("1.8.21").apply(false)
//    kotlin("multiplatform").version("1.9.22").apply(false)
    alias(libs.plugins.kotlinMultiplatform) apply false
    alias(libs.plugins.androidLibrary) apply false
}