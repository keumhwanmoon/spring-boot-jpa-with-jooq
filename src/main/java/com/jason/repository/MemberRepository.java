package com.jason.repository;

import com.jason.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author jason, Moon
 * @since 2016. 9. 8.
 */
public interface MemberRepository extends JpaRepository<Member, Long> {
}
