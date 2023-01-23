package kr.soo.booking.member.domain.participant

import kr.soo.booking.member.domain.MemberRole
import kr.soo.booking.member.domain.vo.Address

data class Participant(
    val email: String,
    val role: MemberRole,
    val address: Address
)
