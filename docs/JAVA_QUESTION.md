# 자바 핵심 개념 정리
<details>
<summary>Java에서 제공하는 원시 타입들에 무엇이 있고, 각각 몇 바이트를 차지하나요?</summary>
<div markdown="1">
boolean(8bit), char(16bit), byte(8bit), short(16bit), int(32bit), long(64bit), float(32bit), double(64bit)
</div>
</details>
<br>

<details>
<summary>오버라이딩(OverRiding)과 오버로딩(OverLoading)에 대해 설명해주세요.</summary>
<div markdown="1">
자바에서 다형성을 지원하기 위한 두 가지 방법.  

<b>오버라이딩: 부모 클래스로부터 상속받은 메소드를 자식 클래스에서 재정의하는 것. 오버라이딩하고자 하는 메소드의 이름, 매개변수, 리턴 값이 모두 같아야 한다. </b>
- 자식 클래스에서 오버라이딩하는 메소드의 접근 제어자는 부모 클래스보다 더 좁게 설정할 수 없다.
- 예외(Exception)는 부모 클래스의 메소드 보다 많이 선언할 수 없다.
- static 메소드를 인스턴스의 메소드로 또는 그 반대로 바꿀 수 없다.

<b>오버로딩: 하나의 메소드 이름으로 여러 기능을 구현하는 것. 같은 이름의 메서드 여러개를 가지면서 매개변수의 유형과 개수가 다르도록 함. </b>
- 매개변수의 개수나 타입이 달라야 하고, 리턴 타입이나 접근 제어자만 다르게 하는 경우에는 오버로딩이 불가능하다.
- 사용 이유1: 같은 기능을 하는 메소드를 하나의 이름으로 사용할 수 있다. 
- 사용 이유2: 메소드의 이름을 절약할 수 있다. 
</div>
</details>
<br>

<details>
<summary>객체지향 프로그래밍(OOP)에 대해 설명해주세요</summary>
<div markdown="1">
객체 지향 프로그래밍 (Object-Oriented Programming, OOP)은 프로그래밍에서 필요한 데이터를 추상화 시켜 상태와 행위를 가진 객체로 만들고, 객체들간의 상호작용을 통해 로직을 구성하는 프로그래밍 방법이다.  

<b>객체란?</b>
객체는 프로그램에서 사용되는 데이터 또는 식별자에 의해 참조되는 공간을 의미하며 값을 저장 할 변수와 작업을 수행 할 메소드를 서로 연관된 것들끼리 묶어서 만든 것을 객체라고 할 수 있다.  

<b>객체 지향 프로그래밍의 특징</b>
1. 추상화
   - 객체에서 공통된 속성과 행위를 추출 하는 것
   - 공통의 속성과 행위를 찾아서 타입을 정의하는 과정
   - 추상화는 불필요한 정보는 숨기고 중요한 정보만을 표현함으로써 프로그램을 간단하게 만드는 것
   - 예시: 자동차라는 추상 집합을 만들어두고 아우디, 현대, 볼보, 니싼을 구현하는 것.
   
2. 캡슐화
   - 데이터 구조와 데이터를 다루는 방법들을 결합 시켜 묶는 것 (변수와 함수를 하나로 묶는 것을 뜻함)
   - 낮은 결합도를 유지할 수 있도록 설계하는 것 
   - 예시: 변수와 메소드를 클래스라는 캡슐 안에 넣어서 분류하는 것

3. 상속
   - 클래스의 속성과 행위를 하위 클래스에 물려주거나 하위 클래스가 상위 클래스의 속성과 행위를 물려받는 것을 말한다
   - 새로운 클래스가 기존의 클래스의 데이터와 연산을 이용할 수 있게 하는 기능
   - 예시: 하위 클래스가 상위 클래스의 데이터와 연산을 이용할 수 있음
4. 다형성
   - 하나의 변수명, 함수명이 상황에 따라 다른 의미로 해석 될 수 있는 것
   - 어떠한 요소에 여러 개념을 넣어 놓는 것
   - 예시: 오버라이딩, 오버로딩
   
[출처: https://jongminfire.dev/객체지향-프로그래밍이란](https://jongminfire.dev/%EA%B0%9D%EC%B2%B4%EC%A7%80%ED%96%A5-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D%EC%9D%B4%EB%9E%80)
</div>
</details>
<br>

<details>
<summary>추상 클래스와 인터페이스에 대해 설명해주시고, 차이에 대해 설명해주세요.</summary>
<div markdown="1">
<table border="1">
    <th></th>
    <th>추상 클래스</th>
    <th>인터페이스</th>
    <tr>
        <td>사용 클래스</td>
        <td>abstract</td>
        <td>interface</td>
    </tr>
    <tr>
        <td>사용 가능 변수</td>
        <td>제한 없음</td>
        <td>static final (상수)</td>
    </tr>
    <tr>
        <td>사용 가능 접근 제어자</td>
        <td>제한 없음 (public, private, protected, default)</td>
        <td>public</td>
    </tr>
    <tr>
        <td>사용 가능 메소드</td>
        <td>제한 없음</td>
        <td>abstract method, default method, static method, private method</td>
    </tr>
    <tr>
        <td>사용 가능 변수</td>
        <td>제한 없음</td>
        <td>static final (상수)</td>
    </tr>
    <tr>
        <td>상속 키워드</td>
        <td>extends</td>
        <td>implements</td>
    </tr>
    <tr>
        <td>다중 상속 가능 여부</td>
        <td>불가능</td>
        <td>가능 (클래스에 다중 구현, 인터페이스 끼리 다중 상속)</td>
    </tr>
    <tr>
        <td>공통점</td>
        <td colspan="2">  
1. 추상 메소드를 가지고 있어야 한다.  

2. 인스턴스화 할 수 없다 (new 생성자 사용 X)

3. 인터페이스 혹은 추상 클래스를 상속받아 구현한 구현체의 인스턴스를 사용해야 한다.

4. 인터페이스와 추상클래스를 구현, 상속한 클래스는 추상 메소드를 반드시 구현하여야 한다.</td>
    </tr>
</table>

<b>추상 클래스</b>: 추상 메서드를 선언해 상속을 통해 자손 클래스를 완성하도록 한다는 것 외에는 일반 클래스와 다른 것이 없다. 상속을 위한 클래스이기 때문에 별도로 객체를 생성할 수는 없다.  
<b>인터페이스</b>: 추상 클래스처럼 다른 클래스를 작성하는데 도움을 주는 목적이고, 클래스와 다르게 다중 상속이 가능하다.   
<b>차이점</b>: 
- 추상클래스는 클라이언트에서 자료형을 사용하기 전에 미리 논리적인 클래스 상속 구조를 만들어 놓고 사용이 결정되는 느낌이다. 추상클래스는 클래스로써 클래스끼리 의미있는 연관관계를 구축할 때 사용한다. 삼각형, 원, 마름모는 도형이고, 사자, 고양이, 얼룩말은 동물인 것처럼 논리적이고 의미적인 연관관계가 있을 때 이들을 계층구조화 할 때 사용한다. 
- 서로 논리적이지 않고 관련이 적은 클래스끼리 필요에 의해 형제처럼 묶을 때 사용한다. 예를 들어서 
<pre><code>// 추상 클래스 (조상 클래스)
abstract class Creature { }

// 추상 클래스 (부모 클래스)
abstract class Animal extends Creature { }
abstract class Fish extends Creature { }

// 자식 클래스
class Parrot extends Animal { }
class Tiger extends Animal { }
class People extends Animal { }

class Whale extends Fish { }</code></pre>
와 같은 상황에서 사람과 고래에 수영 메소드를 구현해야한다면, Creature 추상 클래스에 수영 메소드를 추가해야 한다. 
그러면 수영을 못하는 앵무새와 호랑이도 수영 메소드를 구현해야 하는 문제가 생기고, 이는 객체 지향 설계에 위반되고 유지보수 측면에서도 좋지 않다. 
이럴 때 Swimmable 인터페이스를 구현해서 자유롭게 설계할 수 있다.  

[출처: https://inpa.tistory.com/entry/JAVA-☕-인터페이스-vs-추상클래스-차이점-완벽-이해하기](https://inpa.tistory.com/entry/JAVA-%E2%98%95-%EC%9D%B8%ED%84%B0%ED%8E%98%EC%9D%B4%EC%8A%A4-vs-%EC%B6%94%EC%83%81%ED%81%B4%EB%9E%98%EC%8A%A4-%EC%B0%A8%EC%9D%B4%EC%A0%90-%EC%99%84%EB%B2%BD-%EC%9D%B4%ED%95%B4%ED%95%98%EA%B8%B0)
</div>
</details>
<br>

<details>
<summary>가비지 컬렉션(gc)란 무엇일까요?</summary>
<div markdown="1">
<b>가비지 컬렉션은 자바의 메모리 관리 방법 중의 하나로 JVM의 Heap 영역에서 동적으로 할당했던 메모리 영역 중 필요 없게 된 메모리 영역을 주기적으로 삭제하는 프로세스를 말합니다.</b>
C나 C++에서는 이러한 가비지 컬렉션이 없어 프로그래머가 수동으로 메모리 할당과 해제를 일일이 해줘야 하는 반면 
Java는 JVM에 탑재되어 있는 가비지 컬렉터가 메모리 관리를 대행해주기 때문에 개발자 입장에서 메모리 관리, 메모리 누수(Memory Leak) 문제에서 대해 완벽하게 관리하지 않아도 되어 오롯이 개발에만 집중할 수 있다는 장점이 있습니다.  

[출처](https://coding-factory.tistory.com/829)
</div>
</details>
<br>

<details>
<summary>JVM의 동작 방식에 대해 설명해 주세요.</summary>
<div markdown="1">
<ol>
자바 코드 실행 과정
<li> .java 파일을 자바 컴파일러를 통해 Java Byte Code로 컴파일한다.</li>
<li>컴파인된 코드를 jvm의 클래스 로더로 전달한다.</li>
<li>클래스 로더는 필요한 클래스들을 로딩, 링크하여 런타임 데이터 영역, 즉 jvm의 메모리에 올린다.</li>
<li>실행엔진은 jvm메모리에 올라온 바이트 코드들을 명령어 단위로 하나씩 가져와 읽는다.</li>
</ol>
<ol>
JVM의 구성
<li>클래스 로더</li>
<li>런타임 데이터 영역</li>
<li>실행 엔진</li>
</ol>  

[출처: https://steady-snail.tistory.com/67](https://steady-snail.tistory.com/67)
</div>
</details>
<br>

<details>
<summary>불변 객체란 무엇이고, final은 무엇일까요? 사용하는 이유와 함께 설명해주세요.</summary>
<div markdown="1">
<b>불변 객체란</b> 객체 생성 이후 내부의 상태가 변하지 않는 객체이다. 불변 객체는 read-only 메소드만을 제공하며, 객체의 내부 상태를 제공하는 메소드를 제공하지 않거나 방어적 복사(defensive-copy)를 통해 제공한다. 
Java의 대표적인 불변 객체로는 String이 있다.  

<b>불편 객체를 사용하는 이유</b>
<ol><li>Thread-Safe하여 병렬 프로그래밍에 유용하며, 동기화를 고려하지 않아도 된다.</li>
<li>실패 원자적인(Failure Atomic) 메소드를 만들 수 있다.</li>
<li>Cache나 Map 또는 Set 등의 요소로 활용하기에 더욱 적합하다.</li>
<li>부수 효과(Side Effect)를 피해 오류가능성을 최소화할 수 있다.</li>
<li>다른 사람이 작성한 함수를 예측가능하며 안전하게 사용할 수 있다.</li>
<li>가비지 컬렉션의 성능을 높일 수 있다.</li>
</ol>

[출처: https://mangkyu.tistory.com/131](https://mangkyu.tistory.com/131)
</div>
</details>
<br>

<details>
<summary>자바의 메모리 영역에 대해 설명해주세요.</summary>
<div markdown="1">
JVM의 메모리 공간(Runtime Data Area)은 크게 Method(Static) 영역, Stack 영역, Heap 영역으로 구분되고 
데이터 타입(자료형)에 따라 각 영역에 나눠서 할당 되게 된다.  

<b>메소드 영역</b>
- JVM이 동작해서 클래스가 로딩될 때 생성.
- JVM이 읽어들인 클래스와 인터페이스 대한 런타임 상수 풀, 멤버 변수(필드), 클래스 변수(Static 변수), 상수(final), 생성자(constructor)와 메소드(method) 등을 저장하는 공간.
- Method(Static) 영역에 있는 것은 어느곳에서나 접근 가능
- Method(Static) 영역의 데이터는 프로그램의 시작부터 종료가 될 때까지 메모리에 남아있다. 그래서 static 메모리에 있는 데이터들은 프로그램이 종료될 때까지 어디서든 사용이 가능하다. 그러나 static 데이터를 무분별하게 많이 사용할 경우 메모리 부족 현상이 일어날수 있게 된다.

<b>스택 영역</b>
- 메소드 내에서 정의하는 기본 자료형에 해당되는 지역변수의 데이터 값이 저장되는 공간
- 메소드가 호출될때 스택 영역에 스택 프레임이 생기고 그안에 메소드를 호출
- primitive 타입의 데이터(int, double, byte, long, boolean 등) 에 해당되는 지역변수, 매개 변수 데이터 값이 저장
메소드가 호출 될 때 메모리에 할당되고 종료되면 메모리에서 사라짐
- Stack 은 후입선출 LIFO(Last-In-First-Out) 의 특성을 가지며, 스코프(Scope) 의 범위를 벗어나면 스택 메모리에서 사라진다.

<b>Heap 영역</b>
- JVM이 관리하는 프로그램 상에서 데이터를 저장하기 위해 런타임 시 동적으로 할당하여 사용하는 영역
- 참조형(Reference Type) 데이터 타입을 갖는 객체(인스턴스), 배열 등이 저장 되는 공간
- 단, Heap 영역에 있는 오브젝트들을 가리키는 레퍼런스 변수는 stack에 적재
- Heap 영역은 Stack 영역과 다르게 보관되는 메모리가 호출이 끝나더라도 삭제되지 않고 유지된다.
그러다 어떤 참조 변수도 Heap 영역에 있는 인스턴스를 참조하지 않게 된다면, GC(가비지 컬렉터)에 의해 메모리에서 청소된다.
- stack은 스레드 갯수마다 각각 생성되지만, heap은 몇개의 스레드가 존재하든 상관없이 단 하나의 heap 영역만 존재

[출처: https://inpa.tistory.com/entry/JAVA-☕-그림으로-보는-자바-코드의-메모리-영역(스택-&-힙)](https://inpa.tistory.com/entry/JAVA-%E2%98%95-%EA%B7%B8%EB%A6%BC%EC%9C%BC%EB%A1%9C-%EB%B3%B4%EB%8A%94-%EC%9E%90%EB%B0%94-%EC%BD%94%EB%93%9C%EC%9D%98-%EB%A9%94%EB%AA%A8%EB%A6%AC-%EC%98%81%EC%97%AD%EC%8A%A4%ED%83%9D-%ED%9E%99)
</div>
</details>
<br>

<details>
<summary>new String()과 리터럴(" ")의 차이에 대해 설명해주세요.</summary>
<div markdown="1">
new 연산자를 통해 문자열 객체를 생성하는 경우 메모리의 Heap 영역에 할당되고 
리터럴을 이용한 경우에는 String Constant Pool이라는 영역에 할당된다.
<pre><code>String str1 = "madplay";
String str2 = "madplay";
String str3 = new String("madplay");
String str4 = new String("madplay");</code></pre>
str1과 str2는 String pool에 생성된 같은 문자열을 참조하지만, str3와 str4는 heap 영역에 각각의 객체가 생성되기 때문에
각각 다른 문자열을 참조한다. </div>
</details>
<br>

<details>
<summary>⭐️ 추가 과제: 람다(lambda)에 대해 알아볼까요?</summary>
<div markdown="1">
람다식(Lambda Expression)이란 함수를 하나의 식(expression)으로 표현한 것이다. 함수를 람다식으로 표현하면 메소드의 이름이 필요 없기 때문에, 람다식은 익명 함수(Anonymous Function)의 한 종류라고 볼 수 있다.

익명함수(Anonymous Function)란 함수의 이름이 없는 함수로, 익명함수들은 모두 일급 객체이다.
(<b>일급 객체:</b>
변수나 데이터 구조 안에 담을 수 있다,
파라미터로 전달 할 수 있다,
반환값으로 사용할 수 있다,
할당에 사용된 이름과 무관하게 고유한 구별이 가능하다.)

<pre><code>// 기존의 방식
반환티입 메소드명 (매개변수, ...) {
	실행문
}

// 예시
public String hello() {
    return "Hello World!";
}</code></pre>
<pre><code>// 람다 방식
(매개변수, ... ) -> { 실행문 ... }

// 예시
() -> "Hello World!";</code></pre>
[출처: https://mangkyu.tistory.com/113](https://mangkyu.tistory.com/113)
</div>
</details>
<br>

<details>
<summary>⭐️ 추가 과제: 스트림(stream)에 대해 알아볼까요?</summary>
<div markdown="1">
스트림(Streams)은 람다를 활용할 수 있는 기술 중 하나이다. 
스트림은 '데이터의 흐름’입니다. 배열 또는 컬렉션 인스턴스에 함수 여러 개를 조합해서 원하는 결과를 필터링하고 가공된 결과를 얻을 수 있습니다. 또한 람다를 이용해서 코드의 양을 줄이고 간결하게 표현할 수 있습니다. 즉, 배열과 컬렉션을 함수형으로 처리할 수 있습니다.  


[출처](https://futurecreator.github.io/2018/08/26/java-8-streams/)

</div>
</details>
<br>

