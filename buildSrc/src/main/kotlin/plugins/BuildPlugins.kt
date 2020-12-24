/*
 * Copyright 2020 Furkan Akdemir
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
package plugins

object BuildPlugins {
    private const val PREFIX_PLUGINS = "plugins"

    const val DETEKT = "$PREFIX_PLUGINS.detekt"
    const val SPOTLESS = "$PREFIX_PLUGINS.spotless"
    const val VERSIONS = "$PREFIX_PLUGINS.versions"
    const val KTLINT = "$PREFIX_PLUGINS.ktlint"
    const val UPDATE_DEPENDENCIES = "$PREFIX_PLUGINS.versions"
}