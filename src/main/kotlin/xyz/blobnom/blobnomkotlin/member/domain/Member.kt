package xyz.blobnom.blobnomkotlin.member.domain

import xyz.blobnom.blobnomkotlin.common.enums.Role

data class Member(
    val id: Int,
    val handle: String,
    val role: Role,
    val email: String,
    val password: String,
    val rating: Int,
)
