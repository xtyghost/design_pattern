package com.example.design_pattern.design_pattern.demeter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TeamLeaderTest {
  @Test
    public void test(){
      Boss boss = new Boss();
      TeamLeader teamLeader = new TeamLeader();
      boss.commandCheckNumer(teamLeader);
  }
}