// This is a generated file. Not intended for manual editing.
package com.nikos.gnucobol_3_1.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.nikos.gnucobol_3_1.psi.CobolTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.nikos.gnucobol_3_1.psi.*;

public class CobolEvaluate_Impl extends ASTWrapperPsiElement implements CobolEvaluate_ {

  public CobolEvaluate_Impl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitEvaluate_(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<CobolEvalObject_> getEvalObject_List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CobolEvalObject_.class);
  }

  @Override
  @NotNull
  public List<CobolEvalSubject_> getEvalSubject_List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CobolEvalSubject_.class);
  }

  @Override
  @NotNull
  public List<CobolStatement_> getStatement_List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CobolStatement_.class);
  }

}
