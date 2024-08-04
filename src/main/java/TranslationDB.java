import java.util.ArrayList;
import java.util.Arrays;

public class TranslationDB {

    String subjectsFirstThousand = """
            Philosophy
            Bioethics
            Psychology and pedagogy
            Jurisprudence
            National history
            History of medicine
            Foreign language
            Latin language
            Physics, mathematics
            Medical informatics
            Chemistry
            Biology
            Biological chemistry, oral biochemistry
            Human anatomy
            Histology, embryology and cytology
            Normal physiology
            Pharmacology
            Microbiology, virology, oral microbiology
            Immunology, clinical immunology
            Pathophysiology, head and neck pathophysiology
            Pathologic anatomy, pathologic anatomy of head and neck
            Epidemiology
            Hygiene
            Public health and health care, economics of health care
            Propaedeutics of internal diseases, internal diseases, clinical pharmacology
            Surgical diseases, general surgery
            Radiation diagnostics
            Life safety
            Infectious diseases, phthisiatrics
            Medical rehabilitation
            Neurology
            Otorhinolaryngology
            Ophthalmology
            Obstetrics and gynecology
            Pediatrics
            Dental materials science
            Prophylactic dentistry
            Propaedeutic dentistry
            Cariesology and diseases of hard tissues of teeth
            Endodontics
            Periodontology
            Dental radiology
            General dentistry, gerontostomatology
            Oral surgery, anesthesiology in dentistry
            Prosthodontics, gnathology
            Clinical dentistry
            Ethics, law and management in dentistry
            Dental prosthetics, prosthetics of dentures and complete absence of teeth
            Maxillofacial surgery
            Pediatric dentistry
            Medical genetics
            Orthodontics
            Physical education
            Foreign language in medical practice
            Topographical anatomy and operative surgery
            Normal physiology - maxillofacial physiology
            Regenerative medicine
            Pediatric maxillofacial surgery
            Psychiatry and addiction medicine
            Forensic medicine
            Implantology and reconstructive oral surgery
            Dermatovenerology
            Foreign language in biomedical research
            Nano- and cellular technologies in biology and medicine
            Methods of physiological research
            Modern endodontics
            Maxillofacial cosmetology
            Anesthesiology and intensive care
            Business foreign language (English)
            Methodology of scientific research in management
            Project management in branches of economy
            Modern strategic management
            Managerial economics
            Corporate finance
            Methodology of strategic corporate project management
            Models and mechanisms of strategic corporate governance
            Organizational theory and design
            Legal support of corporate governance
            Technologies of making and realization of corporate strategic decisions
            Transformation management
            Company (business) value management
            Network management
            Strategic investment management
            Strategic reorganization management
            Digital technologies in project management
            Speech culture
            Cultural studies
            Psychology, pedagogy and medical psychology
            Latin language and basics of terminology
            Physics, mathematics and informatics
            General and bioorganic chemistry
            Biology with ecology
            Biological chemistry
            Normal anatomy
            Pathological anatomy, autopsy course
            Histology, embryology, cytology
            Microbiology, virology, immunology
            Pharmacology, clinical pharmacology
            Pathological physiology
            Hygiene and basics of human ecology, military hygiene
            Public health and public health care
            Epidemiology, military epidemiology
            X-ray therapy and X-ray diagnostics
            Therapeutic physical training and medical supervision
            Infectious diseases
            Dermatovenerology
            Neurology, neurosurgery
            Psychiatry, narcology
            Military and extreme medicine
            General nursing (therapy)
            Propaedeutics of internal diseases
            Internal diseases, physiotherapy, military field therapy
            Endocrinology
            Occupational diseases
            Phthisiopulmonology
            Polyclinic therapy
            General nursing (surgery)
            General surgery, anesthesiology
            Operative surgery and topographic anatomy
            Surgical diseases, pediatric surgery
            Dentistry
            Urology
            Traumatology and orthopedics with military field surgery
            Oncology
            Reanimation, intensive care
            Electives
            Pedagogy
            Pathology
            Hygiene and epidemiology of emergency situations
            Microbiology
            General dentistry
            Prosthodontics
            Oral surgery
            Clinical Implantology
            Diagnostics, screening of malignant tumors
            Highly dangerous infections
            Digital technologies in orthodontics
            Orthodontic treatment of patients with periodontal diseases
            History
            Russian language and culture of speech
            Economics
            Basics of law and anti-corruption studies
            Information technologies
            Physical education and sport
            General psychology
            Age and social psychology
            Pedagogical psychology
            Methods of psychological and pedagogical interaction between participants of the educational process
            Psychological and pedagogical support of inclusive education
            Phenomenon of educational activity
            Designing and realization of educational processes
            Design and realization of educational processes
            Practice of Personality-oriented Education
            Sociology
            Mathematics and basics of mathematical processing of information
            Concepts of modern natural science
            Physics
            Theory and methodology of teaching technology
            Information and communication technologies in education
            Computer science
            Theoretical mechanics
            Material resistance
            Theory of mechanisms and machines
            Descriptive geometry
            Drawing
            Electrical engineering
            Radio engineering
            Machine parts
            Materials science
            Basics of creative and design activity
            Design and modeling
            Technological workshop
            Repair and construction works in everyday life
            Professional self-determination of schoolchildren
            Organization of project-research activity of schoolchildren
            Art-pedagogy
            Pedagogical rhetoric
            Entrepreneurship basics
            Chess
            Olympiad movement of schoolchildren
            Elective disciplines (modules) on physical education and sport
            School psychodiagnostics
            Psychological and pedagogical diagnostics and development of giftedness of children and youth
            Research activity in education
            Basics of modern production
            Game technologies in education
            Normative-legal support of education
            Family economics
            Cutting of materials, machine tools and instruments
            Metrology, standardization and certification
            Artistic crafts and folk crafts
            Agricultural technology
            Welding
            Education economics
            Professional legal communications
            Roman private law
            Countering legalization of proceeds of crime
            Professional activities of a lawyer
            Stylistics and rhetoric
            Russian business law
            Family law
            Property law
            Legal statistics
            Political science
            European Union law
            Problems of legal theory
            Prosecutor's supervision
            Legal regulation of operatively-search activity
            Legal regulation of advertising activity
            Financial law
            Criminal law (Special part)
            Criminal procedure
            Economic theory
            Legal psychology
            Environmental Law
            Economic sociology
            Forensic psychiatry
            Customs law
            Judicial power and law enforcement agencies
            Criminal executive law
            Criminal law (General part)
            Theory of state and law
            Labor Law
            National history
            Land law
            Civil law (Special part)
            Housing law
            Information and library culture
            The art of polemics
            Institutional economics
            Informatics and mathematics
            Administrative law
            Arbitration process
            Advocacy
            Administrative justice
            Civil procedure
            Civil law (General part)
            Databases
            Accounting, audit, forensic accounting
            Logics
            International law
            Tax law
            International private law
            Municipal law
            History of political and legal doctrines
            Constitutional law of Russia
            History of state and law of foreign countries
            History of the national state and law
            Criminalistics
            Criminology
            Constitutional law of foreign countries
            Regional economics of the subjects of the Russian Federation: North-Western Federal District
            Mathematics
            Ecology
            Information systems and networks
            Computer science training workshop
            Fundamentals of system analysis
            Theoretical basics of commodity science and expertise
            Standardization, metrology and certification
            Fundamentals of microbiology
            Equipment of enterprises
            Logistics
            Advertising activity
            Legal regulation of professional activity
            Management
            Marketing
            Non-food market
            Accounting and analysis of economic activity
            Tax systems
            Organization and management of enterprise
            Biological damageability of non-food products
            Ethics and psychology in merchandising activity
            Man and his needs
            Basics of foreign economic activity
            Methods and means of consumer goods research
            Methods and devices of non-food goods quality assessment
            Commodity science and expertise of household goods
            Commodity science and expertise of cultural and household goods
            Commodity science and expertise of textile, sewing and knitted goods
            Commodity science and expertise of leather, footwear, fur and fur goods
            Quality management
            Information support of commodity science and examination of goods
            Examination of non-food goods
            Safety of non-food goods
            Aesthetics and design of non-food goods
            Commodity science of packing materials and containers for non-food goods
            Technology of storage and transportation of non-food goods
            Customs examination of quality of non-food goods and raw materials
            Certification of household and cultural goods
            Service maintenance of household and cultural and household goods
            Identification and falsification of consumer goods
            Commodity science and expertise of food products
            Inorganic chemistry
            Analytical chemistry
            Organic chemistry
            Physical chemistry
            Chemical fundamentals of biological processes
            Quantum chemistry
            Psychology
            Introduction to speciality (profession)
            Elective disciplines in physical education and sport
            Academic writing (in a foreign language)
            Fundamentals of Orthodox culture
            Academic writing (in Russian)
            Fundamentals of project management
            Colloidal chemistry
            Structure of matter
            Physical methods of research in chemistry
            Chromatographic and ion exchange methods
            Special chapters of chemistry in English
            Biology with basics of ecology
            Methods of teaching chemistry
            New information technologies in chemistry
            Techniques of chemical experimentation
            High-molecular compounds
            Chemical technology
            Electrochemical methods of analysis
            Spectral methods of analysis of biologically active substances
            Theoretical basics of adsorption at phase boundary
            Analytical control of food products and biologically active substances
            Ecotoxicology (in English)
            Basics of crystal chemistry
            Methods of analysis
            Chemical materials science
            Chemical basics of medical materials science
            History of Tatarstan
            Tatar language
            World art culture
            Management in the field of educational services
            Law in the educational sector
            Natural science picture of the world
            Fundamentals of mathematical information processing
            Computer technologies in innovative teaching of foreign languages
            Information and communication technologies in education and cultural-educational activity
            Introduction to pedagogical practice
            History of education and pedagogical thought
            Theoretical pedagogy
            Practical pedagogy
            Age and pedagogical psychology
            Social psychology
            Methods of teaching and education in the field of foreign languages
            Theory of teaching foreign languages
            Safety of human life activity in emergency situations
            Age anatomy, physiology and hygiene
            Basics of medical knowledge and first aid
            Passport of schoolchildren's health and reflection of healthy lifestyle factors
            History of language
            Theory and practice of translation
            Comparative linguistics
            Lexicology
            Introduction to linguistics
            Ancient Languages (Latin)
            Stylistics
            Practical course of foreign language
            Country and linguocultural studies
            Practical phonetics
            Practical grammar
            Language and intercultural communication
            Technology and methodology of foreign language teaching at secondary general education school
            Russian literature and culture
            Foreign literature and culture
            Coursework in the speciality
            Diachronic peculiarities of learning foreign language
            Rhetorics
            Morphology, syntax and punctuation
            Corrective grammar of foreign language
            Theoretical aspects of foreign language phonetics
            History of linguistic doctrines
            Language of business communication
            Features of modern intercultural communication
            Complex analysis of artistic text in foreign language
            Translation analysis of text
            Philological text analysis
            Modern technologies of teaching speech activity types
            Project methodology of teaching foreign languages
            Technologies of teaching foreign languages to preschool children
            Technologies of preparation for international examinations
            Modern means of evaluation of learning results
            Ethnopedagogy
            Psychology of healthy lifestyle
            Basic Tatar language
            Business Tatar language
            Translation of professionally oriented texts in Tatar language
            Biochemistry
            Anatomy
            Histology, embryology, cytology
            Microbiology, virology
            Immunology
            Pathological anatomy
            Pathophysiology
            Clinical pharmacology
            Neurology, medical genetics, neurosurgery
            Psychiatry, medical psychology
            Life safety, disaster medicine
            Propaedeutics of internal diseases, radiation diagnostics
            Departmental therapy, occupational diseases
            Hospital therapy, endocrinology
            Phthisiology
            General surgery, radiation diagnostics
            Anaesthesiology, reanimation, intensive therapy
            Faculty surgery, urology
            Hospital surgery, pediatric surgery
            Oncology, radiation therapy
            Traumatology, orthopaedics
            Foreign language for medical professionals
            Psychology of conflict
            Natural-scientific basics of medicine
            Fundamentology of medicine
            Patient care
            Nursing
            Fundamentals of scientific research in medicine
            Evidence-based medicine
            Medical and biological conceptual apparatus
            Business Russian language
            Professional communications
            Tropical medicine
            Fundamentals of religious studies
            Social anthropology
            History of world civilisations
            Probability methods in psychology
            Informatics and computer science in psychology
            Anthropology
            Anatomy of the central nervous system
            Physiology of the central nervous system
            Physiology of higher nervous activity and sensory systems
            Ethnosociology
            Information technologies in psychology
            Social ecology
            Integrative studies of personality
            Introduction to profession
            Experimental psychology
            General psychological practice
            History of psychology
            Zoopsychology and comparative psychology
            Psychogenetics
            Psychology of personality
            Psychodynamics
            Methodological basics of psychology
            Mathematical methods in psychology
            Developmental and age psychology
            Labour psychology
            Clinical psychology
            Special psychology
            Psychophysiology
            Methods of teaching psychology
            Psychology of communication
            Management psychology
            Differential psychology
            Methodology of social research
            Problems and perspectives of modern psychology
            Computer statistical systems in psychology
            Social pedagogy
            Basics of psychotherapy
            Gender psychology
            Group dynamics and facilitation
            Psychology of social cognition
            Organizational development
            Psychology of social adaptation
            Personnel management
            Psychological counseling
            Training technology
            Qualitative methods in social-psychological research
            Political psychology
            Psychoanalytic counseling
            Organizational culture diagnostics
            Monitoring of subject-spatial environment
            Marketing psychology
            Conflict and negotiation
            Communicative competence
            Language and communication
            Employment psychology
            Psychology of advertising
            Fundamentals of medical knowledge
            History of Russia
            Basics of economics and production management
            Differential calculus and analytical geometry
            Integral calculus. Rows
            Functions of many variables. Differential equations
            Physical basics of mechanics and molecular physics
            Electromagnetism and waves
            Quantum physics
            General chemistry
            Chemistry of hydrocarbons
            Chemistry of hydrocarbon derivatives
            Analytical chemistry and physical-chemical methods of analysis
            Chemical thermodynamics
            Physical solution chemistry
            Kinetics and catalysis
            Engineering graphics
            Applied mechanics
            Electrical engineering and industrial electronics
            Processes and apparatuses of chemical technology
            Control systems of chemical-technological processes
            Modeling of chemical-technological processes
            Materials science. Technology of structural materials
            General chemical technology
            Chemical reactors
            Economics and organization of oil and gas processing
            History of oil and gas industry
            Business etiquette and culture of communication
            Professional foreign language
            Probability theory and mathematical statistics
            General-purpose software systems
            Oil and gas chemistry
            Synthetic methods of organic chemistry
            Computational mathematics
            Basics of biotechnology
            Basics of nanochemistry
            Quality and certification of petroleum products
            Oil refining technology
            Design and equipment of oil and gas processing plants
            Gas processing
            Basics of lubricant production
            Fundamentals of petrochemical synthesis
            Fundamentals of oil and gas production
            Technical thermodynamics and heat engineering
            Basics of hydraulics
            Modeling and control of technological processes of oil and gas processing
            Professional oriented Russian language
            Reagents for drilling and well maintenance
            Methods of oil and gas production intensification
            Production of high-molecular compounds
            Technology of petrochemical synthesis
            Training scientific and research work of students
            Reagents for combating complications in oil and gas production processes
            Industrial preparation of oil, gas and water
            Physical education (elective discipline)
            Foreign language (English)
            Higher mathematics
            Probability theory and mathematics
            Social and economic statistics
            Customs statistics
            Internet technologies
            Economic geography
            Economic and mathematical methods
            Customs information technologies
            Constitutional law
            Declaration of goods and vehicles
            Fundamentals of national security
            Business law
            Property management
            Supervision of security and customs authorities
            State regulation of economy
            Finance, money circulation and credit
            Economic potential of the customs territory of Russia
            World economy and foreign economic activity
            Customs economics
            Taxes and customs payments
            Currency regulation and currency control
            Civil law
            Civil and arbitration procedure
            Criminal law
            Management in customs authorities
            Organization of customs control of goods and vehicles
            Commodity nomenclature of foreign economic activity
            Customs and tariff regulation of foreign economic activity and customs value
            Customs administration
            History of customs business and customs policy of Russia
            Commodity science and expertise in customs business
            Natural resources management
            Tax system
            Accounting and audit
            Analysis and diagnostics of economic activity
            Management restructuring
            Organization of struggle against economic crimes
            Risk management
            Business valuation
            Information security
            Financial management
            Economic security
            Prevention of economic offenses
            System analysis
            Health economics
            Pathological anatomy, clinical pathological anatomy
            Medical rehabilitation, medical and social expertise
            Disaster medicine
            Faculty therapy
            Hospital therapy
            General surgery
            Faculty surgery
            Hospital surgery
            Pediatric surgery
            Military field surgery, military field therapy
            Fundamental medicine
            Non-infectious epidemiology
            Culture of Russian speech
            Sociology, political science
            Fundamentals of molecular medicine
            Selected issues of tuberculosis
            Palliative therapy
            Elective courses in physical education (elective discipline)
            Foreign language 1 (English)
            History of the Don Cossackdom
            Foreign language 3 (German)
            Philosophy of the East: traditions and modernity
            History of entrepreneurship in Russia
            Mathematics and Informatics (mathematics)
            Mathematics and informatics (Informatics)
            Concepts of modern natural science (physics and chemistry)
            Ecological management in tourism
            Fundamentals of the theory of mass service
            Human being and his needs (service science)
            Service activity
            Psychodiagnostics
            Psychological practice
            Professional ethics and etiquette
            Valeology
            Foreign language 2 (Spanish)
            Speech communication
            World culture and art
            Economics and entrepreneurship in social and cultural services and tourism
            Management in social and cultural service and tourism
            Marketing in social and cultural service and tourism
            Information technologies in social and cultural service and tourism
            Organizational engineering
            Methods of scientific research
            Standardization and certification of social and cultural and tourist services
            Regional studies
            Geography of tourism in the Russian Federation and CIS
            Recreational resource science
            Currency and financial operations in social and cultural service and tourism
            Technique and technology of social and cultural service and tourism
            Legal support of social and cultural service and tourism
            Advertising in operations in social-cultural service and tourism
            Public relations
            Documentation management support of social and cultural service and tourism
            Innovations in social and cultural service and tourism
            Introduction to tourism
            Organization of tourist enterprise activity
            Organization of service in tourist and hotel complexes
            Theory and methodology of sports and self-organized tourism
            Organization of social tourism
            Excursion studies
            Organization of catering in resort and hotel complexes
            Transport provision in the tourism industry
            Organization of outbound tourism
            Animation in tourism activity
            Taxes and taxation
            Medical basics in the tourism industry
            Country studies
            Accounting and audit in tourism and hotel economy
            Museum studies
            Exposition and exhibition work
            Tourism securities
            Management of social-cultural sector and tourism
            Russian and foreign literature
            Tourist formalities
            Sanitary and hygienic basics of restaurant and hotel service
            Basics of price formation in the tourist sector
            Fundamentals of management
            History of management
            Organization theory
            World economics
            Finance and credit
            Statistics
            Accounting
            Organizational behavior
            Economic law
            Economic history
            Ethics and culture of management
            Econometrics
            Analysis of financial and economic activity of the enterprise
            Documentary support of management
            Sociology of management
            Economics of enterprises
            Research of social-economic and political processes
            Strategic management
            Management systems research
            Managerial decisions
            Management information technologies
            History of the USSR (pre-Soviet period)
            History of the USSR of the Soviet period
            History of foreign countries
            History of philosophy
            History of the Communist Party of the Soviet Union
            Soviet law
            Higher mathematics and mathematical methods in management
            Mathematical logic
            Documentary science
            Computer science and basics of programming
            Documentology
            History of state institutions
            Political economy
            Documentary linguistics
            Technical film and photo documentation
            Technology and organization of document management
            History of ethical and aesthetic doctrines
            Archivology
            Theory and practice of management
            Ergonomics
            Management ethics
            Information support of management
            Information systems
            History of social and political doctrines
            Special course
            Special seminar
            Course work on documentology
            Course work on theory and practice of management
            Course work on the organization of document management
            Course work on information systems
            Course work on information support of management
            World history
            History of the Russian state and law
            Roman law
            Criminal law of Russia and foreign countries
            Criminal procedure of the Russian Federation and foreign countries
            Labor law of Russia and foreign countries
            Administrative law of Russia
            Administrative law of foreign countries
            International public law
            Civil law of Russia
            Civil and commercial law of foreign countries
            Civil procedure and arbitration of Russia
            Civil procedure and arbitration of foreign countries
            Financial law of Russia
            Financial law of foreign countries
            Law enforcement authorities in Russia
            Customs law of Russia
            International customs law and customs law of foreign countries
            Transport law of Russia and foreign countries
            International economic relations
            Basics of accounting and foreign trade statistics
            Public service
            History of international relations and foreign policy of Russia
            Legal regulation of foreign economic relations
            Insurance in the Russian Federation and foreign countries
            Business partnerships and societies
            Mathematics and informatics
            Basics of diplomatic service and practice
            English language (first)
            Legal categories and concepts in English
            Translation skills
            Civil defence
            Physical education
            Russian language stylistics and speech culture
            Ancient languages and cultures
            General linguistics
            History of linguistics
            History of language and introduction to special philology
            Theoretical phonetics
            Lexicology
            Theoretical grammar
            Fundamentals of 2nd language theory
            Introduction to the theory of intercultural communication
            Practical course of the first foreign language
            Practical course of the second foreign language
            History and culture of the target language countries
            History of literature of the target language countries
            Sociolinguistics
            American English language
            English-language literature of multiculturalism
            Delinquent culture of the USA and Great Britain
            British prose of the 21st century
            Statistical processing of linguistic texts
            Peculiarities of translating media texts
            Dictionaries and Internet resources in the translator's work
            English poetry in Russian translations
            Translation theory
            Practical course of translation (first language)
            Practical course of translation (second language)
            Practical course in the culture of speech communication (first language)
            Practical course in the culture of speech communication (second language)
            Corrective grammar course
            Culture of written speech
            Culture of business communication
            Peculiarities of legal translation
            Spanish language
            Mathematical modeling of systems and processes
            Basics of theoretical mechanics
            Computer graphics
            Simulation modeling
            Chemical current sources
            Descriptive geometry. Engineering graphics
            Mechanics. Applied mechanics
            Theoretical basics of electrical engineering
            Electronics
            Life safety (including life safety in emergency situations)s
            Electrical machines and electric drive
            Theory of discrete devices of automatics and telemechanics
            Basics of technical diagnostics
            Basics of reliability theory
            Economics of transport
            Electric networks and power systems
            Theory of nonlinear circuits
            Theory of electric traction
            Railroad power supply
            Traction and transformer substations
            Automation of power supply system
            Relay protection
            Contact networks and power lines
            Construction, installation and operation of power supply devices
            Electronic equipment and converters in power supply
            Economics of power supply economy
            Electric railroads
            Emergency modes and electrocorrosion processes in traction power supply
            Electromagnetic compatibility on electric railroads
            Traction electric machines and transformers
            Electrical safety in power supply devices
            Accounting, finance, audit in electric power supply
            Microprocessor information and management systems in power supply industry
            Basics of automated design
            Speed and high-speed traffic on electrified railroads
            Systems of automated design (CAD) and construction of power complexes
            Methods of management decision making
            Information technologies in management
            Management theory
            Accounting and analysis
            Human resources management
            Corporate social responsibility
            Leadership
            Business planning
            Investment analysis
            Mass service theory
            Economics of air transportation
            Basics of aircraft flight operation
            Basics of technical operation and organization of aircraft maintenance and repair
            Organization of air transport operations
            State support of safety of air transport operation
            Aircraft flight safety management system
            Commercial activity in air transport
            Operational management of aviation enterprises
            Economic mechanism of aviation enterprises
            Quality management of aviation enterprises
            Innovative management of air transportation
            History of civil aviation
            Professional-oriented English language
            History of economic doctrines
            Economic and mathematical methods in management
            Information technologies in air transportation production
            Air law
            State regulation of activity of economic entities of air transport
            Risk management of aviation enterprises
            Analysis of production and economic activity of aviation enterprises
            Organization of airspace use and air traffic services
            Labor organization of aviation personnel
            Psychology of business communication
            Basics of computer linguistics
            History of language and introduction to special philology
            Practical grammar of the English language
            Practical phonetics of the English language
            Practical course of the English language
            Practical course of the German language
            Linguo-country studies
            German studies
            Foreign literature
            Psycholinguistics
            Practical translation course (English)
            Practical translation course (German)
            Practical course in the culture of speech communication (English)
            Practical course in the culture of speech communication (German)
            Comparative typology of the English and Russian languages
            Special course in philology
            Special course in translation
            Security of information resources
            Introduction to the specialty
            Computers, systems and networks
            Additional chapters of computer science
            Identification of dynamic objects
            Information networks and communications
            Linear algebra and analytical geometry
            Mathematical fundamentals of systems theory
            Metrology and measurement technology
            Microprocessor automation devices
            Modeling of control systems
            Basics of personal and communicative culture
            Programming
            Psychology and technologies of social interaction
            System software
            Systems of technological processes automation
            Specialized controllers
            Specialized packages for automated systems design
            Special chapters of mathematics
            Special chapters of physics
            Circuit engineering
            Automatic control theory
            Information theory, coding and data transmission
            Signal theory
            Technical means of automation and control
            Object interface devices
            First aid and patient care
            Economics and law
            IT and e-health
            Medical rehabilitation
            Anesthesiology, intensive care
            Emergency medicine
            Polyclinic business
            Medical embryology
            Political history
            Cultural history
            Military training
            Physical therapy, medical supervision
            Medical biology and genetics
            Medical and biological physics
            Histology
            Autopsy course
            General hygiene with ecology, military hygiene
            Social hygiene and health care organization
            Therapy. General nursing
            Polyclinic training
            Tuberculosis
            Radiation therapy
            Surgery. General nursing
            Operative surgery, topographic anatomy
            Traumatology
            Military field surgery
            Infectious diseases with epidemiology
            Neurology, neurosurgery, medical genetics
            Psychiatry
            Medical psychology
            Obstetrics
            Gynecology
            Economics, sociology
            Political science, jurisprudence
            Basics of psychology and pedagogy
            Copyright law
            Fundamentals of spiritual and moral culture
            History of art
            Academic drawing
            Academic painting
            Academic sculpture and plastic modeling
            Technical drawing
            Color science and coloristics
            History of design, science and technology
            Plastic anatomy
            Basics of project graphics
            Propaedeutics
            Designing
            Basics of production skills
            Multimedia technologies
            Photographics
            Font
            Illustration
            Graphic techniques
            Printing technologies
            History of graphic design
            Communications in design
            Layout
            Trend analysis
            Theoretical informatics
            Methodology of scientific research
            Basics of labor law
            Systems design theory
            Security of computing systems and networks
            Architecture and hardware of computing networks
            Network operating systems
            Administration of computing networks
            Information security in networks
            Programming languages
            Free software
            Sociology and social psychology
            Mathematical modeling
            Physical basics of measurement
            Descriptive geometry, engineering graphics
            Electrical machines and apparatuses
            Electronics and microprocessor technology
            Technological processes of mechanical engineering production
            Accuracy standardization
            Hydraulics and hydraulic drive
            Methods of engineering creativity
            Forming processes and tools
            Control of processes and objects in mechanical engineering
            Hardware and software of control systems
            Mechanical engineering technology
            Equipment of mechanical engineering production
            Information-measuring technology of control systems
            Drives of automatic technological equipment
            Design of automation means for technological equipment
            Execution of graduate work
            Computer technologies in science and education
            Technics of experiment
            Automation and control systems
            Design of control systems
            Automated electric drive
            Hydropneumatic drive and hydropneumatic automation
            Mathematical basics of control theory
            Automation of production processes
            Computer-aided design and computer-aided manufacturing systems
            Program control of machine tools and complexes
            Philosophical questions of natural science and technology
            Methodology of scientific creativity
            History and methodology of science
            Design and research of automation equipment
            GAP design and research
            Modern problems of mechanical engineering
            Basics of pedagogy and psychology
            Scientific research work
            Political economy and history of economic doctrines
            Theoretical basics of progressive technology
            Computer and programming
            Basics of construction and design
            Applied mathematics
            Economics of nature resources management
            Ergonomics and design
            Government and business protocol
            Modern information technologies
            Foreign language (French)
            """;

    String subjectsSecondThousand = """
            International relations and world politics
            International monetary and credit relations
            International transportation operations and logistics
            Innovation management
            Accounting and analysis
            Digital information technologies in management
            International commercial operations
            Brand management
            Conjuncture
            Management of foreign economic activity
            Exchange business
            International management
            Financial mathematics
            History of the Russian entrepreneurship
            State and municipal management
            International stock and currency exchanges
            Advertising
            Fundamentals of banking
            Project management
            Internet-marketing
            Cross-cultural management
            Industrial materials
            Economic efficiency of new equipment
            Basics of economic theory
            Economics of mechanical engineering industry
            Technology of mechanical engineering industry
            Economic and mathematical methods and models
            Sociology and psychology of management
            Qualimetry
            Management theory
            Labour and wage management
            Macroeconomics
            Organization of mechanical engineering production
            Basics of entrepreneurial activity
            Innovation and production potential
            Fundamentals of law
            Economics and sociology of labor
            History of labor and entrepreneurship
            Ethics of business relations
            Innovative management in personnel work
            Administrative systems and office technologies
            Human resources management at the enterprise
            Production management
            Economic analysis of enterprise activity
            Elective disciplines
            Management of social development of the enterprise
            Personality management
            Conflictology
            Employment management
            Motivation of labor activity
            Special elective course (basics of economic theory)
            Chemical sensor design: from fundamentals to practical applications
            Crystallochemistry
            Materials chemistry
            Introduction to solid state physics
            Electrochemistry: fundamentals and applications
            Applied materials and their use
            Materials research methods
            Crystal structure research methods
            Marketing and commercialization for entrepreneurs
            Key skills for innovators: critical and creative thinking, communication and collaboration
            Blockchain entrepreneurship and innovation
            English language for dissertation
            Research seminar for the final qualification work
            Research seminar
            Russian language
            Genetics
            Evidence-based medicine: principles and methodology
            Emergency cardiology
            Transplantology
            Written professional communication in foreign language
            Oral professional communication in foreign language
            Ultrasound diagnostics
            Computer and magnetic resonance tomography
            Medical field of international humanitarian law
            History (module)
            History of Russia up to the twentieth century
            History of Russia of the XX - XXI centuries.
            General history
            Information technologies in advertising and public relations
            Basics of legal knowledge
            Basics of communication theory
            History of advertising
            Advertising in World culture
            Sociology of mass communications
            Psychology of mass communications
            Consumer behavior
            Visual communications
            Marketing basics
            Marketing research and situation analysis
            Basics of integrated communications
            Speech communications
            Stylistics and literary editing in advertising
            Technologies of public relations and relations with state authorities
            Theory and practice of public relations
            Theory and practice of mass information
            Basics of project activity
            Copywriting
            Planning, implementation of communication campaigns and events
            Basics of branding
            Economics of advertising activity
            Theory and practice of negotiations
            Physical education and sport (module)
            Technology of advertising photography
            Development and technology of production of advertising product: video advertising
            Design in advertising
            Creativity in advertising
            Development and technology of production of advertising product: print advertising
            Modern internet communications
            Organization of advertising and public relations departments
            Media planning
            Advertising in industries and spheres of activity
            Event communications
            Naming
            Outdoor and indoor advertising
            Corporate identity
            Communications in social networks
            Project management in advertising
            Imageology
            Direct marketing
            Ethics of entrepreneurship
            Finance
            Accounting theory
            Probability theory and mathematical statistics
            Money, credit, banks
            Economics of organizations
            History of entrepreneurship
            Information systems in economics
            Financial accounting
            Finances of enterprises
            Theory of economic analysis
            Management accounting
            Financial reporting
            Stock market
            Insurance
            Business communication
            Accounting at small enterprises
            Accounting in construction
            Price formation
            Laboratory workshop on accounting
            Accounting in trade
            Complex economic analysis of economic activity
            Control and revision
            Audit
            Risk analysis and assessment
            General and inorganic chemistry
            World and national culture
            Analytical chemistry and physico-chemical methods of analysis
            Mechanics
            Art of business communication
            Electrical engineering and electronics
            Organic chemistry and chemistry of biologically active substances
            Economics (basics of economic theory)
            Technical chemistry, oil chemistry
            Analytical chemistry and physico-chemical methods of analysis
            Basics of market economy
            History of development of oil and chemical industry
            Ecological problems of the Republic of Bashkortostan
            Materials science.Technology of structural materials
            Surface phenomena and disperse systems
            Design and equipment of organic synthesis and fuel production enterprises
            National policy and interethnic relations
            Kinetics and catalysis in industry
            Economics and production management
            Basics of technology of chemical and biochemical productions
            Mathematical modeling in chemical technology
            Modern problems of chemical technology
            History and methodology of chemical technology
            Computer technologies in science and production
            Philosophical questions of natural and technical sciences
            Additional chapters of mathematics
            Additional chapters of chemistry
            Pedagogy and psychology
            Modern oil and oil processing industry
            Special chapters of chemical technology of fuels processing
            Theoretical fundamentals of chemical technology of fuels and carbon materials
            Modeling in chemical industry and calculation of reactors
            Fundamentals of scientific research and design
            Scientific research practice
            Scientific pedagogical practice
            Professional ethics
            History and theory of religion
            Functional anatomy of the central nervous system
            Neurophysiology
            Workshop on neurophysiology
            Modern concepts of natural science
            Statistical methods and mathematical modeling
            Psychology of extreme situations and states
            Introduction to clinical psychology
            General psychological workshop
            Psychological supervision
            Research methodology in psychology
            Projective methods in clinical psychology
            Workshop on psychodiagnostics
            Methods of teaching psychology in higher school
            Theories of personality in clinical psychology
            Psychotherapy: theory and practice
            Health psychology
            Neuropsychology
            Gender and sexuality psychology
            Special psychology and correctional-developmental education
            Mental developmental disorders in childhood
            Clinical psychology in gerontology and geriatrics
            Forensic psychological expertise
            Psychopharmacology
            Organizational psychology
            Psychosomatics
            Socio-psychological training
            Negotiation training
            Modern information technologies and computers in psychology
            Family psychology
            Psychological support in extreme professions
            Thanatology and suicidology
            Victimology
            Family psychotherapy
            Psychology of grief and loss
            Psychological assistance to victims
            Psychodiagnosis of crisis states from violence
            Specialization training program
            Rehabilitation of combatants
            Physiology of GND and sensory systems
            Psychological basics of rehabilitation
            Sensitivity training
            Workshop on pathopsychological diagnostics and expertise
            Workshop on neuropsychological diagnostics
            Workshop on psychotherapy and counseling
            Workshop on psychosomatics
            Psychology of deviant behavior
            Workshop on pediatric pathopsychology
            Methodological training
            Neurotic and personality disorders
            Pathopsychology
            Elective courses on physical education and sport
            Modern concepts of neuroontogenesis
            Psychology of social work
            Methodological problems of clinical psychology
            Psychology of corporality
            Fundamentals of psychogenetics
            Clinic of internal diseases
            Psychological prevention of addictive behavior
            Scientific research work:
            Practice on obtaining primary professional skills and abilities, including primary skills and abilities of scientific research activity of the 1st course
            Practice on obtaining primary professional skills and abilities, including primary skills and abilities of scientific research activity of the 2nd course
            Scientific research work of the 3rd course
            Scientific research work of the 4th course
            Scientific research work of the 5th course
            Practice on obtaining professional skills and experience of professional activity 3rd course
            Practice on obtaining professional skills and experience of professional activity of the 4th course
            Practice on obtaining professional skills and experience of professional activity of the 5th course
            Pedagogical practice of the 4th course
            Pedagogical practice of the 5th course
            Pre-graduation practice
            Medical and biological physics, medical devices
            Biology, ecology
            Informatics, higher mathematics
            Bioorganic chemistry
            Psychology and pedagogical basics of doctor's activity
            Propedeutics of internal diseases, nursing of patients
            Pathological anatomy with sectional course
            General surgery, anesthesiology, patient care
            Radiation diagnostics and therapy
            Hygiene with basic human ecology, hygiene of children and adolescents, military hygiene
            Dermatovenerology, pediatric dermatovenerology
            Propaedeutics of pediatric diseases, with courses on healthy child and general child care
            Internal diseases, occupational diseases, endocrinology, military field therapy
            Surgical diseases, traumatology, orthopedics, oncology, military field surgery
            Obstetrics and gynecology, pediatric gynecology
            Pediatric surgical diseases with orthopedics, intensive care and anesthesiology and general nursing care
            Public health and healthcare, medical informatics
            Neurology, neurosurgery, medical genetics, pediatric neurology
            Infectious diseases, epidemiology and military epidemiology
            Psychiatry, narcology, psychotherapy
            Otorhinolaryngology, pediatric otorhinolaryngology
            Phthisiopulmonology and pediatric tuberculosis
            Pediatric infectious diseases
            Pediatric diseases, endocrinology, general physiotherapy
            Ophthalmology, pediatric ophthalmology
            Physical therapy, medical supervision and physiotherapy
            Polyclinic pediatrics
            Engineering calculations of physical and chemical properties of substances
            Organic chemistry and basics of biochemistry
            Chemistry of natural energy sources
            Physical technology of fuel
            Theoretical basics of chemical technology of fuels and carbon materials
            Production of industrial catalysts
            Chemical technology of fuels and carbon materials
            Modeling in chemical technology and calculation of reactors
            Educational research work of students
            Oil and gas technology
            History of world culture
            History, culture of Bashkortostan
            Ethics and moral norms
            Mathematical methods in electrical engineering
            Modeling of electric circuits and fields
            Electrical machines
            Electrical and electronic devices
            Physical basics of electronics
            Electrical equipment of industrial enterprises substations
            Electric drive
            Digital devices of electric drives control systems
            Engineering and technology in industry
            Electric drive theory
            Elements of automation systems
            Electrical networks and basics of power supply
            Global problems of the modern time
            Methods and tools of information collection and processing
            Economics and organization of electric drives production
            Control systems of electric drives
            Relay protection of electric motors and power supply systems
            Nature and ecology of Bashkortostan
            Automated electric drive of typical production mechanisms on technological complexes
            Operation and repair of electric machines and electric drives
            Electrification and electric drive of industrial plants
            """;

    protected String[] getSubjectsArray() {
        String[] array1 = subjectsFirstThousand.split("\n");
        String[] array2 = subjectsSecondThousand.split("\n");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(array1));
        list.addAll(Arrays.asList(array2));
        return list.toArray(new String[0]);
    }
}
