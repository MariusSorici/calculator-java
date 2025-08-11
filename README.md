## Raport analiză cod

**LOC total proiect:** 148  
- Calculator.java → 129 linii (fără comentarii și linii goale)  
- Start.java → 19 linii (fără comentarii și linii goale)  

**Complexitate ciclomatică:**  
- evaluateExpression → 10  
- Calculate → 10  

**Complexitate cognitivă:**  
- evaluateExpression → aproximativ 12 (mai multe condiții și verificări)  
- Calculate → aproximativ 13 (condiții și calcule asemănătoare cu evaluateExpression)  

---

### Observații:
1. Calculator.java – linia 40 – Sunt mai multe `if` unul în altul, ceea ce face codul mai greu de urmărit.  
2. Calculator.java – linia 65 – Unele variabile au nume scurte, ar fi mai clar să aibă nume care explică rolul lor.  
3. Calculator.java – linia 85 – Lipsește un comentariu pentru a explica logica din acea parte a codului.  
4. Start.java – linia 10 – Ar fi util un comentariu care explică ce face metoda `main`.  

---

**Concluzie:**  
Codul funcționează, dar poate fi îmbunătățit prin comentarii, nume de variabile mai clare și evitarea folosirii prea multor `if` imbricate.
