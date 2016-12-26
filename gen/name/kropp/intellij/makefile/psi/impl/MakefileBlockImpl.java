// This is a generated file. Not intended for manual editing.
package name.kropp.intellij.makefile.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import name.kropp.intellij.makefile.psi.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MakefileBlockImpl extends ASTWrapperPsiElement implements MakefileBlock {

  public MakefileBlockImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MakefileVisitor visitor) {
    visitor.visitBlock(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MakefileVisitor) accept((MakefileVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MakefileDefine getDefine() {
    return findChildByClass(MakefileDefine.class);
  }

  @Override
  @Nullable
  public MakefileExport getExport() {
    return findChildByClass(MakefileExport.class);
  }

  @Override
  @Nullable
  public MakefileInclude getInclude() {
    return findChildByClass(MakefileInclude.class);
  }

  @Override
  @Nullable
  public MakefileOverride getOverride() {
    return findChildByClass(MakefileOverride.class);
  }

  @Override
  @Nullable
  public MakefilePrivatevar getPrivatevar() {
    return findChildByClass(MakefilePrivatevar.class);
  }

  @Override
  @Nullable
  public MakefileUndefine getUndefine() {
    return findChildByClass(MakefileUndefine.class);
  }

  @Override
  @Nullable
  public MakefileVariableAssignment getVariableAssignment() {
    return findChildByClass(MakefileVariableAssignment.class);
  }

  @Override
  @Nullable
  public MakefileVpath getVpath() {
    return findChildByClass(MakefileVpath.class);
  }

}
