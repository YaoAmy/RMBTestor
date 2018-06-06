Feature:test


@tag1
  Scenario: Begin with "hello word"
  	Given word hello
  	Then Begin with hello

  Scenario:学生平均成绩表核对  
    Given 连接学生平均成绩表A，地址A1，库名A2
    Given 连接学生总成绩表B，地址B1，库名B2
    When 通过sql1查询表B每名学生的平均成绩
    Then B表查询出的平均成绩与A表中的平均成绩一致