# SE-LAB Calculator

### 1. 프로젝트 스펙
1. 자바 버전 : 16

### 2. 기타사항

#### 2-1. 패키지의 역할
1. calculatelogic : 계산 로직이 들어있는 패키지
   1. nomallogic : 스트림을 사용하지 않은 로직
2. inputlogic : 문자열을 입력받는 클래스의 패키지
3. sequencelogic : 프로그램의 흐름을 제어하는 클래스의 패키지
4. showconsole : 콘솔에 표시하는 클래스들의 패키지
5. storage : 프로그램이 실행되며 저장되는 정보들을 저장하는 클래스의 패키지
6. validatelogic : 입력받은 문자열이 올바른지 검사해주는 클래스의 패키지
   1. sequence : 문자열을 검사하는 순서를 저장하는 클래스

#### 2-2. 클래스의 역할
1. NormalCalculateLogic : 계산하는 로직이 들어있다
   1. OperatorMap : 계산하는데 필요한 Map을 생성하는 클래스
2. CalculateConfig : DIP를 지키기 위하여 작성된 클래스
---
3. InputBufferReader : 버퍼리더를 사용하여 문자열을 입력받는 클래스
4. InputConfig : DIP를 지키기 위하여 작성된 클래스
---
5. MainSequence : 메인 실행 로직을 담당하는 클래스
---
6. LengthError : 길이로 인한 오류가 있음을 콘솔창에 알리는 클래스
7. NumberError : 숫자로 인한 오류가 있음을 콘솔창에 알리는 클래스
8. PlaceError : 입력받은 위치에 인한 오류가 있음을 콘솔창에 알리는 클래스
9. SignError : 연산기호에 인한 오류가 있음을 콘솔창에 알리는 클래스
---
10. Formula : 수학식을 저장하기 위한 클래스
11. Sign : 열거형 연산기호를 저장하고 사용하기 위한 클래스
12. StorageConfig : DIP를 지키기 위하여 작성된 클래스4
---
13. SequenceConfig : DIP를 지키기 위하여 작성된 클래스
14. SequenceOne : 검사 순서를 정하는 클래스
15. ConsoleConfig : DIP를 지키기 위하여 작성됨 ( 검사와 콘솔창 출력 )
16. ValidateLength : 입력 받은 문자열의 길이를 검사하는 로직
17. ValidateNumber : 입력 받은 숫자가 유효한지 검사하는 로직
18. ValidatePlace : 입력 받은 문자가 유효한 자리에 있는지 검사하는 로직
19. ValidateSign : 입력한 부호가 유효한지 검사하는 로직
---
20. CalculatorMain : main 함수가 있다.




#### 2-3. 인터페이스의 역할
1. CalculateLogic : 추상메소드로 메소드의 이름을 정하며 DIP를 지킬 수 있도록 함
2. InputLogic : 추상 메소드로 메소드의 이름을 정하며 DIP를 지킬 수 있도록 함
3. ShowConsole : 추상 메소드로 메소드의 이름을 정하며 DIP를 지킬 수 있도록 함
4. ValidateSequence : 추상 메소드로 메소드의 이름을 정하며 DIP를 지킬 수 있도록 함
5. ValidateLogic : 추상 메소드로 메소드의 이름을 정하며 DIP를 지킬 수 있도록 함

## 3. 전체적인 흐름
문자열을 입력받으면 입력받은 문자열을 검사로직에서 유효한지 검사한 후 계산 로직으로 넘어가고 나온 값을 콘솔창에 띄운다

