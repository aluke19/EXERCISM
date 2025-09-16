package EXERCISM;

public class SqueakyClean {

    public static String clean(String identifier) {
        StringBuilder out = new StringBuilder();

        for (int cont = 0; cont < identifier.length(); cont++) {
            char ch = identifier.charAt(cont);

            // 1) espacios -> barrabaja
            if (ch == ' ') {
                out.append('_');
                continue;
            }

            // 2) leet -> letra
            if (ch == '4')
                ch = 'a';
            else if (ch == '3')
                ch = 'e';
            else if (ch == '0')
                ch = 'o';
            else if (ch == '1')
                ch = 'l';
            else if (ch == '7')
                ch = 't';

            // 3) kebab-case -> camelCase (consumimos el siguiente char)
            if (ch == '-') {
                cont++; // avanzamos para mirar el siguiente
                if (cont < identifier.length()) {
                    char next = identifier.charAt(cont);

                    // si justo después del '-' hay un espacio, lo convertimos a '_'
                    if (next == ' ') {
                        out.append('_');
                        continue;
                    }

                    // también aplicamos leet al siguiente, por coherencia
                    if (next == '4')
                        next = 'a';
                    else if (next == '3')
                        next = 'e';
                    else if (next == '0')
                        next = 'o';
                    else if (next == '1')
                        next = 'l';
                    else if (next == '7')
                        next = 't';

                    // solo añadimos si es letra o '_'
                    if (next == '_' || Character.isLetter(next)) {
                        out.append(Character.toUpperCase(next));
                    }
                }
                // si el '-' era el último carácter, no añadimos nada
                continue;
            }

            // 4) solo dejamos pasar letras o '_'
            if (ch == '_' || Character.isLetter(ch)) {
                out.append(ch);
            }
            // si no es letra ni '_', se ignora
        }

        return out.toString();
    }
}
