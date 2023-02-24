# diff between command pattern & strategy pattern

> Command 패턴과 Strategy 패턴은 둘 다 소프트웨어 애플리케이션에서 책임을 캡슐화하고 분리하는 데 사용되는 행동 디자인 패턴입니다. 그러나 그들은 의도와 사용 방법에서 차이가 있습니다.
> 
> Command 패턴은 요청을 객체로 캡슐화하여 요청을 다른 객체의 매개 변수로 전달할 수 있도록하며, 이를 통해 요청자를 수행하는 객체와 분리할 수 있습니다.
> 이 패턴은 작업을 수행하는 Command 객체와 명령을 적절한 수신 객체에 보내는 Invoker 객체로 구성됩니다. 수신 객체는 요청된 작업을 수행합니다. Command 패턴은 요청자와 수신자를 분리해야하는 경우나 실행 취소 / 다시 실행 기능이 필요한 경우에 유용합니다.
> 
> Strategy 패턴은 관련된 알고리즘 패밀리를 캡슐화하여 특정한 요구 사항에 따라 런타임에 선택할 수 있도록합니다. 이를 통해 객체의 동작을 인터페이스에 영향을주지 않고 동적으로 변경할 수 있습니다. 이 패턴은 Strategy 객체에 대한 참조를 포함하는 Context 객체로 구성됩니다. Strategy 객체는 실행될 알고리즘을 캡슐화합니다. Context 객체는 알고리즘 실행을 Strategy 객체에 위임합니다. Strategy 패턴은 서로 다른 알고리즘이 서로 다른 상황에서 사용되어야하는 경우나 객체의 동작을 런타임에 변경해야하는 경우에 유용합니다.
> 
> 요약하면, Command 패턴은 요청을 객체로 캡슐화하고, Strategy 패턴은 관련된 알고리즘을 객체로 캡슐화하는 데 사용됩니다.

---------------
> Both the Command and Strategy patterns are behavioral design patterns that can be used to encapsulate and separate responsibilities in software applications. However, they differ in their intent and usage.
> 
> The Command pattern is used to encapsulate a request as an object, thereby allowing the request to be passed around as a parameter to other objects. This allows the requester to be decoupled from the object that performs the action. The pattern consists of a Command object, which contains the action to be performed, and an Invoker object, which sends the command to the appropriate receiver object. The receiver object performs the requested action. The Command pattern is useful in cases where the requester and the receiver need to be decoupled, or where undo/redo functionality is required.
> 
> The Strategy pattern is used to encapsulate a family of related algorithms, allowing them to be selected at runtime based on specific needs. This allows the behavior of an object to be changed dynamically without affecting its interface. The pattern consists of a Context object, which contains a reference to a Strategy object. The Strategy object encapsulates the algorithm to be executed. The Context object delegates the algorithm execution to the Strategy object. The Strategy pattern is useful in cases where different algorithms need to be used in different situations, or where the behavior of an object needs to be changed at runtime.
> 
> In summary, the Command pattern is used to encapsulate requests as objects, while the Strategy pattern is used to encapsulate related algorithms as objects.

