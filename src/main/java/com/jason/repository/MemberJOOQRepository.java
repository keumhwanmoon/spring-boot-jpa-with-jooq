package com.jason.repository;

import com.jason.domain.Member;

import java.util.List;

/**
 * @author jason, Moon
 * @since 2016. 9. 8.
 */
public interface MemberJOOQRepository {
    public List<Member> findMembers();
}
