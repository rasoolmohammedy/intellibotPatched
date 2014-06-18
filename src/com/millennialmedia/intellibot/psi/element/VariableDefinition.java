package com.millennialmedia.intellibot.psi.element;

import com.intellij.psi.PsiElement;

/**
 * @author mrubino
 */
public interface VariableDefinition {
    
    boolean matches(String text);

    PsiElement reference();
}
