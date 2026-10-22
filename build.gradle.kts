import org.jetbrains.kotlin.gradle.internal.builtins.StandardNames.FqNames.target

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.compose) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.gradle.dependencies.sorter) apply false
    alias(libs.plugins.spotless) apply false
    alias(libs.plugins.version.catalog.update)
}

subprojects {
    // This automatically applies it to every module in the project
    plugins.apply("com.squareup.sort-dependencies")
    plugins.apply("com.diffplug.spotless")
    configure<com.diffplug.gradle.spotless.SpotlessExtension> {
        kotlin {
            target("**/src/*/java/**/*.kt", "**/src/*/kotlin/**/*.kt")
            targetExclude("${layout.buildDirectory}/**/*.kt")

            ktlint()
                .editorConfigOverride(
                    mapOf(
                        "android" to "true",
                        "ktlint_function_naming_ignore_when_annotated_with" to "Composable",
                        // THIS LINE allows Spotless to automatically fix wildcard imports!
                        "ij_kotlin_packages_to_use_import_on_demand" to "unset",
                        // Forces Ktlint to break down wildcard imports by setting the allowable limit near infinity
                        "ij_kotlin_name_count_to_use_star_import" to "999",
                        "ij_kotlin_name_count_to_use_star_import_for_members" to "999"
                    ),
                )

            trimTrailingWhitespace()
            endWithNewline()
        }

        kotlinGradle {
            target("*.gradle.kts", "**/*.gradle.kts")
            targetExclude("${layout.buildDirectory}/**/*.gradle.kts")

            ktlint()

            trimTrailingWhitespace()
            endWithNewline()
        }
    }

}