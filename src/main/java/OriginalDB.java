public class OriginalDB {

    String subjects = """
            Философия
            Биоэтика
            Психология и педагогика
            Правоведение
            История Отечества
            История медицины
            Иностранный язык
            Латинский язык
            Физика, математика
            Медицинская информатика
            Химия
            Биология
            Биологическая химия, биохимия полости рта
            Анатомия человека
            Гистология, эмбриология и цитология
            Нормальная физиология
            Фармакология
            Микробиология, вирусология, микробиология полости рта
            Иммунология, клиническая иммунология
            Патофизиология, патофизиология головы и шеи
            Патологическая анатомия, патологическая анатомия головы и шеи
            Эпидемиология
            Гигиена
            Общественное здоровье и здравоохранение, экономика здравоохранения
            Пропедевтика внутренних болезней, внутренние болезни, клиническая фармакология
            Хирургические болезни, общая хирургия
            Лучевая диагностика
            Безопасность жизнедеятельности
            Инфекционные болезни, фтизиатрия
            Медицинская реабилитация
            Неврология
            Оториноларингология
            Офтальмология
            Акушерство и гинекология
            Педиатрия
            Стоматологическое материаловедение
            Стоматология профилактическая
            Стоматология пропедевтическая
            Кариесология и заболевание твердых тканей зубов
            Эндодонтия
            Пародонтология
            Стоматологическая радиология
            Стоматология терапевтическая, геронтостоматология
            Стоматология хирургическая, анестезиология в стоматологии
            Стоматология ортопедическая, гнатология
            Стоматология клиническая
            Этика, право и менеджмент в стоматологии
            Зубопротезирование, протезирование зубных рядов и полном отсутствии зубов
            Челюстно-лицевая хирургия
            Детская стоматология
            Медицинская генетика
            Ортодонтия
            Физическая культура
            Иностранный язык в медицинской практике
            Топографическая анатомия и оперативная хирургия
            Нормальная физиология - физиология челюстно-лицевой области
            Регенеративная медицина
            Детская челюстно-лицевая хирургия
            Психиатрия и наркология
            Судебная медицина
            Имплантология и реконструктивная хирургия полости рта
            Дерматовенерология
            Иностранный язык в биомедицинских исследованиях
            Нано- и клеточные технологии в биологии и медицине
            Методы физиологических исследований
            Современная эндодонтия
            Челюстно-лицевая косметология
            Анестезиология и реаниматология
            Деловой иностранный язык (английский)
            Методология научных исследований в менеджменте
            Проектное управление в отраслях экономики
            Современный стратегический менеджмент
            Управленческая экономика
            Корпоративные финансы
            Методология управления стратегическими проектами компании
            Модели и механизмы стратегического корпоративного управления
            Организационная теория и дизайн
            Правовое обеспечение корпоративного управления
            Технологии принятия и реализации корпоративных стратегических решений
            Трансформационный менеджмент
            Управление стоимостью компании (бизнеса)
            Сетевой менеджмент
            Стратегическое управление инвестициями
            Управление стратегической реорганизацией
            Цифровые технологии в управлении проектами
            Культура речи
            Культурология
            Психология, педагогика и медицинская психология
            Латинский язык и основы терминологии
            Физика, математика и информатика
            Общая и биоорганическая химия
            Биология с экологией
            Биологическая химия
            Нормальная анатомия
            Патологическая анатомия, секционный курс
            Гистология, эмбриологии, цитология
            Микробиология, вирусология, иммунология
            Фармакология, клиническая фармакология
            Патологическая физиология
            Гигиена и основы экологии человека, военная гигиена
            Общественное здоровье и здравоохранение
            Эпидемиология, военная эпидемиология
            Лучевая терапия и лучевая диагностика
            Лечебная физкультура и врачебный контроль
            Инфекционные болезни
            Дерматовенерологии
            Неврология, нейрохирургия
            Психиатрия, наркология
            Военная и экстремальная медицина
            Общий уход за больными (терапия)
            Пропедевтика внутренних болезней
            Внутренние болезни, физиотерапия, военно-полевая терапия
            Эндокринология
            Профессиональные болезни
            Фтизиопульмонология
            Поликлиническая терапия
            Общий уход за больными (хирургия)
            Общая хирургия, анестезиология
            Оперативная хирургия и топографическая анатомия
            Хирургические болезни, детская хирургия
            Стоматология
            Урология
            Травматология и ортопедия с военно-полевой хирургией
            Онкология
            Реанимация, интенсивная терапия
            Элективы
            Педагогика
            Патология
            Гигиена и эпидемиология чрезвычайных ситуаций
            Микробиология
            Терапевтическая стоматология
            Ортопедическая стоматология
            Хирургическая стоматология
            Клиническая имплантология
            Диагностика, скрининг злокачественных опухолей
            Особо-опасные инфекции
            Цифровые технологии в ортодонтии
            Ортодонтическое лечение пациентов с заболеваниями пародонта
            История
            Русский язык и культура речи
            Экономика
            Основы правоведения и противодействия коррупции
            Информационные технологии
            Физическая культура и спорт
            Общая психология
            Возрастная и социальная психология
            Педагогическая психология
            Методы психолого-педагогического взаимодействия участников образовательного процесса
            Психолого-педагогическое сопровождение инклюзивного образования
            Феномен образовательной деятельности
            Конструирование и реализация воспитательных процессов
            Конструирование и реализация образовательных процессов
            Практика личностно-ориентированного образования
            Социология
            Математика и основы математической обработки информации
            Концепции современного естествознания
            Физика
            Теория и методика обучения технологии
            Информационные и коммуникационные технологии в образовании
            Информатика
            Теоретическая механика
            Сопротивление материалов
            Теория механизмов и машин
            Начертательная геометрия
            Черчение
            Электротехника
            Радиотехника
            Детали машин
            Материаловедение
            Основы творческо-конструкторской деятельности
            Конструирование и моделирование
            Технологический практикум
            Ремонтно-строительные работы в быту
            Профессиональное самоопределение школьников
            Организация проектно-исследовательской деятельности школьников
            Арт-педагогика
            Педагогическая риторика
            Основы предпринимательства
            Шахматы
            Олимпиадное движение школьников
            Элективные дисциплины (модули) по физической культуре и спорту
            Школьная психодиагностика
            Психолого-педагогическая диагностика и развитие одаренности детей и молодежи
            Исследовательская деятельность в образовании
            Основы современного производства
            Игровые технологии в образовании
            Нормативно-правовое обеспечение образования
            Экономика семьи
            Резание материалов, станки и инструменты
            Метрология, стандартизация и сертификация
            Художественные ремёсла и народные промыслы
            Сельскохозяйственные технологии
            Сварочное дело
            Экономика образования
            Профессиональные юридические коммуникации
            Римское частное право
            Противодействие легализации доходов, полученных преступным путем
            Профессиональная деятельность юриста
            Стилистика и риторика
            Российское предпринимательское право
            Семейное право
            Право собственности
            Правовая статистика
            Политология
            Право Европейского союза
            Проблемы теории права
            Прокурорский надзор
            Правовое регулирование оперативно-розыскной деятельности
            Правовое регулирование рекламной деятельности
            Финансовое право
            Уголовное право (Особенная часть)
            Уголовный процесс
            Экономическая теория
            Юридическая психология
            Экологическое право
            Экономическая социология
            Судебная психиатрия
            Таможенное право
            Судебная власть и правоохранительные органы
            Уголовно-исполнительное право
            Уголовное право (Общая часть)
            Теория государства и права
            Трудовое право
            Отечественная история
            Земельное право
            Гражданское право (Особенная часть)
            Жилищное право
            Информационно-библиотечная культура
            Искусство полемики
            Институциональная экономика
            Информатика и математика
            Административное право
            Арбитражный процесс
            Адвокатура
            Административная юстиция
            Гражданский процесс
            Гражданское право (Общая часть)
            Базы данных
            Бухгалтерский учет, аудит, судебная бухгалтерия
            Логика
            Международное право
            Налоговое право
            Международное частное право
            Муниципальное право
            История политических и правовых учений
            Конституционное право России
            История государства и права зарубежных стран
            История отечественного государства и права
            Криминалистика
            Криминология
            Конституционное право зарубежных стран
            Региональная экономика субъектов РФ: Северо-Западный федеральный округ
            Математика
            Экология
            Информационные системы и сети
            Учебный практикум по вычислительной технике
            Основы системного анализа
            Теоретические основы товароведения и экспертизы
            Стандартизация, метрология и сертификация
            Основы микробиологии
            Оборудование предприятий
            Логистика
            Рекламная деятельность
            Правовое регулирование профессиональной деятельности
            Менеджмент
            Маркетинг
            Рынок непродовольственных товаров
            Бухгалтерский учет и анализ хозяйственной деятельности
            Налоговые системы
            Организация и управление предприятием
            Биологическая повреждаемость непродовольственных товаров
            Этики и психология в товароведной деятельности
            Человек и его потребности
            Основы внешнеэкономической деятельности
            Методы и средства исследований потребительских товаров
            Методы и приборы оценки качества непродовольственных товаров
            Товароведение и экспертиза товаров хозяйственного назначения
            Товароведение и экспертиза товаров культурно-бытового назначения
            Товароведение и экспертиза текстильных, швейных и трикотажных товаров
            Товароведение и экспертиза кожевенно-обувных, пушно-меховых товаров
            Управление качеством
            Информационное обеспечение товароведения и экспертизы товаров
            Экспертиза непродовольственных товаров
            Безопасность непродовольственных товаров
            Эстетика и дизайн непродовольственных товаров
            Товароведение упаковочных материалов и тары для непродовольственных товаров
            Технология хранения и транспортирования непродовольственных товаров
            Таможенная экспертиза качества непродовольственных товаров и сырья
            Сертификация товаров хозяйственного и культурно-бытового назначения
            Сервисное обслуживание товаров хозяйственного и культурно-бытового назначения
            Идентификация и фальсификации потребительских товаров
            Товароведение и экспертиза продовольственных товаров
            Неорганическая химия
            Аналитическая химия
            Органическая химия
            Физическая химия
            Химические основы биологических процессов
            Квантовая химия
            Психология
            Введение в специальность (профессию)
            Элективные дисциплины по физической культуре и спорту
            Академическое письмо (на иностранном языке)
            Основы православной культуры
            Академическое письмо (на русском языке)
            Основы проектного менеджмента
            Коллоидная химия
            Строение вещества
            Физические методы исследования в химии
            Хроматографические и ионообменные методы
            Спец. главы химии на английском языке
            Биология с основами экологии
            Методика преподавания химии
            Новые информационные технологии в химии
            Техника химического эксперимента
            Высокомолекулярные соединения
            Химическая технология
            Электрохимические методы анализа
            Спектральные методы анализа биологически активных веществ
            Теоретические основы адсорбции на границах раздела фаз
            Аналитический контроль пищевых продуктов и биологически активных веществ
            Экотоксикология (на английском языке)
            Основы кристаллохимии
            Методы анализа
            Химическое материаловедение
            Химические основы медицинского материаловедения
            История Татарстана
            Татарский язык
            Мировая художественная культура
            Менеджмент в сфере образовательных услуг
            Право в сфере образования
            Естественнонаучная картина мира
            Основы математической обработки информации
            Компьютерные технологии в инновационном обучении иностранным языкам
            Информационные и коммуникационные технологии в образовании и культурно-просветительской деятельности
            Введение в педагогическую деятельность
            История образования и педагогической мысли
            Теоретическая педагогика
            Практическая педагогика
            Возрастная и педагогическая психология
            Социальная психология
            Методика обучения и воспитания в области иностранных языков
            Теория обучения иностранным языкам
            Безопасность жизнедеятельности человека в чрезвычайных ситуациях
            Возрастная анатомия, физиология и гигиена
            Основы медицинских знаний и первой медицинской помощи
            Паспорт здоровья школьников и отражение факторов здорового образа жизни
            История языка
            Теория и практика перевода
            Сопоставительное языкознание
            Лексикология
            Введение в языкознание
            Древние языки (латинский язык)
            Стилистика
            Практический курс иностранного языка
            Страноведение и лингвострановедение
            Практическая фонетика
            Практическая грамматика
            Язык и межкультурная коммуникация
            Технология и методика обучения иностранному языку в средней общеобразовательной школе
            Русская литература и культура
            Зарубежная литература и культура
            Курсовые работы по направлению подготовки
            Диахронические особенности изучения иностранного языка
            Риторика
            Морфология, синтаксис и пунктуация
            Коррективная грамматика иностранного языка
            Теоретические аспекты фонетики иностранного языка
            История лингвистических учений
            Язык делового общения
            Особенности современной межкультурной коммуникации
            Комплексный анализ художественного текста на иностранном языке
            Переводческий анализ текста
            Филологический анализ текста
            Современные технологии обучения видам речевой деятельности
            Проектная методика обучения иностранным языкам
            Технологии обучения иностранным языкам дошкольников
            Технологии подготовки к международным экзаменам
            Современные средства оценивания результатов обучения
            Этнопедагогика
            Психология здорового образа жизни
            Базовый татарский язык
            Деловой татарский язык
            Перевод профессионально ориентированных текстов на татарском языке
            Биохимия
            Анатомия
            Гистология, эмбриология, цитология
            Микробиология, вирусология
            Иммунология
            Патологическая анатомия
            Патофизиология
            Клиническая фармакология
            Неврология, медицинская генетика, нейрохирургия
            Психиатрия, медицинская психология
            Безопасность жизнедеятельности, медицина катастроф
            Пропедевтика внутренних болезней, лучевая диагностика
            Факультетская терапия, профессиональные болезни
            Госпитальная терапия, эндокринология
            Фтизиатрия
            Общая хирургия, лучевая диагностика
            Анестезиология, реанимация, интенсивная терапия
            Факультетская хирургия, урология
            Госпитальная хирургия, детская хирургия
            Онкология, лучевая терапия
            Травматология, ортопедия
            Иностранный язык для медиков
            Психология конфликта
            Естественно-научные основы медицины
            Фундаментология медицины
            Уход за больными
            Сестринское дело
            Основы научных исследований в медицине
            Доказательная медицина
            Медико-биологический понятийный аппарат
            Деловой русский язык
            Профессиональные коммуникации
            Тропическая медицина
            Основы религиоведения
            Социальная антропология
            История мировых цивилизаций
            Вероятностные методы в психологии
            Информатика и ЭВМ в психологии
            Антропология
            Анатомия центральной нервной системы
            Физиология центральной нервной системы
            Физиологии высшей нервной деятельности и сенсорных систем
            Этносоциология
            Информационные технологии в психологии
            Социальная экология
            Интегративные исследования личности
            Введение в профессию
            Экспериментальная психология
            Общий психологический практикум
            История психологии
            Зоопсихология и сравнительная психология
            Психогенетика
            Психология личности
            Психоднелюстна
            Методологические основы психологии
            Математические методы в психологии
            Психология развития и возрастная психология
            Психология труда
            Клиническая психология
            Специальная психология
            Психофизиология
            Методика преподавания психологии
            Психология общения
            Психология управления
            Дифференциальная психология
            Методология социальных исследований
            Проблемы и перспективы современной психологии
            Компьютерные статистические системы в психологии
            Социальная педагогика
            Основы психотерапии
            Гендерная психология
            Групповая динамика и фасилитация
            Психология социального познания
            Организационное развитие
            Психология социальной адаптации
            Управление персоналом
            Психологическое консультирование
            Технология тренингов
            Качественные методы в социально-психологических исследованиях
            Политическая психология
            Психоаналитическое консультирование
            Диагностика организационной культуры
            Мониторинг предметно-пространственной среды
            Психология маркетинга
            Конфликт и переговоры
            Коммуникативная компетентность
            Язык и коммуникация
            Психология занятости
            Психология рекламы
            Основы медицинских знаний
            История России
            Основы экономики и управления производством
            Дифференциальное исчисление и аналитическая геометрия
            Интегральное исчисление. Ряды
            Функции многих переменных. Дифференциальные уравнения
            Физические основы механики и молекулярная физика
            Электромагнетизм и волны
            Квантовая физика
            Общая химия
            Химия углеводородов
            Химия производных углеводородов
            Аналитическая химия и ФХМА
            Химическая термодинамика
            Физическая химия растворов
            Кинетика и катализ
            Инженерная графика
            Прикладная механика
            Электротехника и промышленная электроника
            Процессы и аппараты химической технологии
            Системы управления химико-технологическими процессами
            Моделирование химико-технологических процессов
            Материаловедение. Технология конструкционных материалов
            Общая химическая технология
            Химические реакторы
            Экономика и организация нефтегазопереработки
            История нефтегазовой отрасли
            Деловой этикет и культура коммуникации
            Профилированный иностранный язык
            Теория вероятностей и математическая статистика
            Программные комплексы общего назначения
            Химия нефти и газа
            Синтетические методы органической химии
            Вычислительная математика
            Основы биотехнологии
            Основы нанохимии
            Качество и сертификация нефтепродуктов
            Технология переработки нефти
            Проектирование и оборудование нефте- и газоперерабатывающих заводов
            Переработка газа
            Основы производства смазочных материалов
            Основы нефтехимического синтеза
            Основы нефтегазодобычи
            Техническая термодинамика и теплотехника
            Основы гидравлики
            Моделирование и управление технологическими процессами нефтегазопереработки
            Профессионально-ориентированный русский язык
            Реагенты для бурения и ремонта скважин
            Методы интенсификации нефтегазодобычи
            Производство высокомолекулярных соединений
            Технология нефтехимического синтеза
            УНИРС
            Реагенты для борьбы с осложнениями в процессах нефтегазодобычи
            Промысловая подготовка нефти, газа и воды
            Физическая культура (элективная дисциплина)
            Иностранный язык (английский)
            Высшая математика
            Теория вероятностей и математика
            Социально-экономическая статистика
            Таможенная статистика
            Интернет-технологии
            Экономическая география
            Экономико-математические методы
            Информационные таможенные технологии
            Конституционное право
            Декларирование товаров и транспортных средств
            Основы национальной безопасности
            Предпринимательское право
            Управление собственностью
            Надзор за силовыми и таможенными органами
            Государственное регулирование экономики
            Финансы, денежное обращение и кредит
            Экономический потенциал таможенной территории России
            Мировая экономика и внешнеэкономическая деятельность
            Экономика таможенного дела
            Налоги и таможенные платежи
            Валютное регулирование и валютный контроль
            Гражданское право
            Гражданский и арбитражный процесс
            Уголовное право
            Управление в таможенных органах
            Организация таможенного контроля товаров и транспортных средств
            Товарная номенклатура внешнеэкономической деятельности
            Таможенно-тарифное регулирование внешнеэкономической деятельности и таможенная стоимость
            Таможенное делопроизводство
            История таможенного дела и таможенной политики России
            Товароведение и экспертиза в таможенном деле
            Природопользование
            Налоговая система
            Бухгалтерский учет и аудит
            Анализ и диагностика хозяйственной деятельности
            Реструктуризация управления
            Организация борьбы с экономическими преступлениями
            Управление рисками
            Оценка бизнеса
            Информационная безопасность
            Финансовый менеджмент
            Экономическая безопасность
            Профилактика экономических правонарушений
            Системный анализ
            Экономика здравоохранения
            Патологическая анатомия, клиническая патологическая анатомия
            Медицинская реабилитация, медико-социальная экспертиза
            Медицина катастроф
            Факультетская терапия
            Госпитальная терапия
            Общая хирургия
            Факультетская хирургия
            Госпитальная хирургия
            Детская хирургия
            ВПХ, ВПТ
            Фундаментальная медицина
            Неинфекционная эпидемиология
            Культура русской речи
            Социология, политология
            Основы молекулярной медицины
            Избранные вопросы туберкулеза
            Паллиативная терапия
            Элективные курсы по физической культуре (элективная дисциплина)
            Иностранный язык 1 (английский)
            История Донского казачества
            Иностранный язык 3 (немецкий)
            Философия Востока: традиции и современность
            История предпринимательства в России
            Математика и информатика (математика)
            Математика и информатика (информатика)
            Концепции современного естествознания (физика и химия)
            Экологический менеджмент в туризме
            Основы теории массового обслуживания
            Человек и его потребности (Сервисология)
            Сервисная деятельность
            Психодиагностика
            Психологический практикум
            Профессиональная этика и этикет
            Валеология
            Иностранный язык 2 (испанский)
            Речевая коммуникация
            Мировая культура и искусство
            Экономика и предпринимательство в социально-культурном сервисе и туризме
            Менеджмент в социально-культурном сервисе и туризме
            Маркетинг в социально-культурном сервисе и туризме
            Информационные технологии в социально-культурном сервисе и туризме
            Оргтехника
            Методы научных исследований
            Стандартизация и сертификация социально-культурных и туристских услуг
            Краеведение
            География туризма РФ и СНГ
            Рекреационное ресурсоведение
            Валютно-финансовые операции в социально-культурном сервисе и туризме
            Техника и технология социально-культурного сервиса и туризма
            Правовое обеспечение социально-культурного сервиса и туризма
            Реклама в операции в социально-культурном сервисе и туризме
            Связь с общественностью (Паблик рилейшнз)
            Документационное обеспечение управления социально-культурным сервисом и туризмом
            Инновации в социально-культурном сервисе и туризме
            Введение в туризм
            Организация деятельности туристского предприятия
            Организация обслуживания в туристских и гостиничных комплексах
            Теория и методика спортивного и самодеятельного туризма
            Организация социального туризма
            Экскурсоведение
            Организация питания в курортных и гостиничных комплексах
            Транспортное обеспечение в туризме
            Организация выездного туризма
            Анимация в туристской деятельности
            Налоги и налогообложение
            Медицинские основы в туризме
            Страноведение
            Бухгалтерский учет и аудит в туризме и гостиничном хозяйстве
            Музееведение
            Экспозиционная и выставочная работа
            Ценные бумаги в туризме
            Управление социально-культурной сферой и туризмом
            Русская и зарубежная литература
            Туристские формальности
            Санитарно-гигиенические основы ресторанного и гостиничного сервиса
            Основы ценообразования в туристской сфере
            Основы менеджмента
            История менеджмента
            Теория организации
            Мировая экономика
            Финансы и кредит
            Статистика
            Бухгалтерский учет
            Организационное поведение
            Хозяйственное право
            История экономики
            Этика и культура управления
            Эконометрика
            Анализ финансово-хозяйственной деятельности предприятия
            Документационное обеспечение управления
            Социология управления
            Экономика предприятий
            Исследование социально-экономических и политических процессов
            Стратегический менеджмент
            Исследование систем управления
            Управленческие решения
            Информационные технологии управления
            История СССР (досоветский период)
            История СССР советского периода
            История зарубежных стран
            История философии
            История КПСС
            Советское право
            Высшая математика и математические методы в управлении
            Математическая логика
            Документалистика
            Вычислительная техника и основы программирования
            Документоведение
            История государственных учреждений
            Политическая экономия
            Документная лингвистика
            Техническое кинофонофотодокументирование
            Технология и организация делопроизводства
            История этических и эстетических учений
            Архивоведение
            Теория и практика управления
            Эргономика
            Управленческая этика
            Информационное обеспечение управления
            Информационные системы
            История социально-политических учений
            Спецкурс
            Спецсеминар
            Курсовая работа по документоведению
            Курсовая работа по теории и практике управления
            Курсовая работа по организации делопроизводства
            Курсовая работа по информационным системам
            Курсовая работа по информационному обеспечению управления
            Всемирная история
            История государства и права России
            Римское право
            Уголовное право России и зарубежных стран
            Уголовный процесс РФ и зарубежных стран
            Трудовое право России и зарубежных стран
            Административное право России
            Административное право зарубежных стран
            Международное публичное право
            Гражданское право России
            Гражданское и торговое право зарубежных стран
            Гражданский процесс и арбитраж России
            Гражданский процесс и арбитраж зарубежных стран
            Финансовое право России
            Финансовое право зарубежных стран
            Правоохранительные органы в России
            Таможенное право России
            Международное таможенное право и таможенное право зарубежных стран
            Транспортное право России и зарубежных стран
            Международные экономические отношения
            Основы бухгалтерского учета и внешнеторговой статистики
            Государственная служба
            История международных отношений и внешней политики России
            Правовое регулирование внешнеэкономических связей
            Страхование в РФ и зарубежных странах
            Хозяйственные товарищества и общества
            Математика и информатика
            Основы дипломатической службы и практики
            Английский язык (первый)
            Юридические категории и понятия в английском языке
            Навыки переводческой деятельности
            Гражданская оборона
            Физическое воспитание
            Стилистика русского языка и культура речи
            Древние языки и культуры
            Общее языкознание
            История языкознания
            История языка и введение в специальную филологию
            Теоретическая фонетика
            Лексикология
            Теоретическая грамматика
            Основы теории 2-го языка
            Введение в теорию межкультурной коммуникации
            Практический курс первого иностранного языка
            Практический курс второго иностранного языка
            История и культура стран изучаемых языков
            История литературы стран изучаемых языков
            Социолингвистика
            Американский английский
            Англоязычная литература мультикультурализма
            Делинквентная культура США и Великобритании
            Британская проза 21 века
            Статистическая обработка лингвистических текстов
            Особенности перевода медиатекстов
            Словари и Интернет-ресурсы в работе переводчика
            Английская поэзия в русских переводах
            Теория перевода
            Практический курс перевода (первый язык)
            Практический курс перевода (второй язык)
            Практикум по культуре речевого общения (первый язык)
            Практикум по культуре речевого общения (второй язык)
            Коррективный курс грамматики
            Культура письменной речи
            Культура делового общения
            Особенности юридического перевода
            Испанский язык
            """;

    public String[] getSubjectsArray() {
        return subjects.split("\n");
    }
}