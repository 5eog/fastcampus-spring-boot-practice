# Lombok

- Spring initializr 에서 생성가능
- 코드 중복을 줄여준다.

### @Data
- @Getter + @Setter + @RequiredArgsConstructor + @ToString + @EqualsAndHashCode  
- 편하지만, 모든 것이 포함되기 때문에 조심해야 한다.

### @Value
- 불변 객체를 만들때 사용한다.
- @Getter @FieldDefaults(makeFinal=true, level=AccessLevel.PRIVATE)
- @AllArgsConstructor, @ToString , @EqualsAndHashCode  

### @RequiredArgsConstructor
- 스프링 생성자 주입에 어룰려서 애용된다.

### 단점
- 사용자의 의도와 컴파일러의 눈을 피해가는 동작이 가능하다.
  - 특정 객체가 final일 때 빈 값이 들어가는 생성자가 생성된다.
- ToString 순환 참조 문제
  - exclude를 사용할 수 있도록 했지만, 해당 필드를 문자열로 바꾸기 때문에 불안정하다.
  - 14에서 recode가 나오면서 해당 문제를 해결
- 자동으로 다 해주지만 디테일을 나도 모르게 바꿔버린다.
- 프로그래밍 세계는 계속 발전중..!