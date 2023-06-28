# SE-LAB Calculator

### 1. 요구사항
> 추가적인 기능 구현 환영! 물론, 필수적인 구현은 무조건~
1. 덧셈, 뺄셈, 나눗셈, 곱셈이 가능한 계산기를 구현합니다.
2. 입력은 `30 + 20 / 2 * 4` 순으로 받으며, 연산자 우선순위 없이 앞에서 부터 계산을 진행합니다.=
3. 출력은 `100`으로 나옵니다.

---
###  2. 구현 소개
1. `GetInputValue`클래스에서 `String`으로 `inputValue`값을 얻어옴.
2. `CheckNumOperator`클래스에서 **짝수 홀수** `index`에 각각 비연산자, 연산자가 고정적임을 이용.
   - `split()`메소드를 이용해 `tokens`로 분리하여 `ArrayList`에 저장.
3. `CheckNumOperator`클래스 내 `ArrayList`에 저장된 (비)연산자를 `Calculator`클래스에서 계산.
4. `Calculator`클래스 내 `calcResult` 값을 출력.

- `GetInputValue` : `input`값을 얻어내는 **클래스**
- `CheckNumOperator` : 연산자와 비연산자를 구분하는 **클래스**
  - 연산자는 **홀수** `index`, 비연산자(숫자)는 **짝수** `index`에 있음을 이용.
- `Calculator` : 구분한 연산자와 비연산자를 `Operator`클래스를 이용해 결과값을 도출해내는 **클래스**
- `Number` : `ArrayList`타입으로 비연산자를 저장하는 **클래스**
- `Operator` : 연산자를 `Enum`으로 저장해 입력받은 연산자와 비교하여 계산하는 **클래스**
- `PrintResult` : 결과값을 출력하는 **클래스**

### 3. 추가 구현 목표
1. ~~`split(" ")`을 이용했을 때, 비연산자는 필히 짝수 `index`, 연산자는 홀수 `index`에 있을 것이다.~~
2. ~~따라서 구별 방식을 홀짝으로 구별하여 `inputNum`,`inputOperator` 을 구별하도록 구현해볼 것이다.~~
   - 구현 완료