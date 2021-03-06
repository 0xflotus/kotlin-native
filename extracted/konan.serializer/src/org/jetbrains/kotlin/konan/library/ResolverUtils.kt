package org.jetbrains.kotlin.konan.library

import org.jetbrains.kotlin.konan.library.resolver.KonanLibraryResolver
import org.jetbrains.kotlin.konan.library.resolver.impl.KonanLibraryResolverImpl
import org.jetbrains.kotlin.konan.KonanAbiVersion

fun SearchPathResolverWithTarget.libraryResolver(): KonanLibraryResolver =
        KonanLibraryResolverImpl(this)
