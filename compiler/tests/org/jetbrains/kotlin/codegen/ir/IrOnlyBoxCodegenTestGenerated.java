/*
 * Copyright 2010-2016 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.codegen.ir;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/ir/box")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class IrOnlyBoxCodegenTestGenerated extends AbstractIrBlackBoxCodegenTest {
    public void testAllFilesPresentInBox() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/ir/box"), Pattern.compile("^(.+)\\.kt$"), true);
    }

    @TestMetadata("classInitializers.kt")
    public void testClassInitializers() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/box/classInitializers.kt");
        doTest(fileName);
    }

    @TestMetadata("enumClass.kt")
    public void testEnumClass() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/box/enumClass.kt");
        doTest(fileName);
    }

    @TestMetadata("enumClass2.kt")
    public void testEnumClass2() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/box/enumClass2.kt");
        doTest(fileName);
    }

    @TestMetadata("enumClass3.kt")
    public void testEnumClass3() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/box/enumClass3.kt");
        doTest(fileName);
    }

    @TestMetadata("fileClassInitializers.kt")
    public void testFileClassInitializers() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/box/fileClassInitializers.kt");
        doTest(fileName);
    }

    @TestMetadata("objectClass.kt")
    public void testObjectClass() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/box/objectClass.kt");
        doTest(fileName);
    }

    @TestMetadata("simple.kt")
    public void testSimple() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/box/simple.kt");
        doTest(fileName);
    }

    @TestMetadata("compiler/testData/ir/box/closureConversion")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class ClosureConversion extends AbstractIrBlackBoxCodegenTest {
        public void testAllFilesPresentInClosureConversion() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/ir/box/closureConversion"), Pattern.compile("^(.+)\\.kt$"), true);
        }

        @TestMetadata("closureConversion1.kt")
        public void testClosureConversion1() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/box/closureConversion/closureConversion1.kt");
            doTest(fileName);
        }

        @TestMetadata("closureConversion2.kt")
        public void testClosureConversion2() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/box/closureConversion/closureConversion2.kt");
            doTest(fileName);
        }

        @TestMetadata("closureConversion3.kt")
        public void testClosureConversion3() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/box/closureConversion/closureConversion3.kt");
            doTest(fileName);
        }

        @TestMetadata("closureConversion4.kt")
        public void testClosureConversion4() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/box/closureConversion/closureConversion4.kt");
            doTest(fileName);
        }

        @TestMetadata("innerClass1.kt")
        public void testInnerClass1() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/box/closureConversion/innerClass1.kt");
            doTest(fileName);
        }

        @TestMetadata("innerClass2.kt")
        public void testInnerClass2() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/box/closureConversion/innerClass2.kt");
            doTest(fileName);
        }

        @TestMetadata("mutable1.kt")
        public void testMutable1() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/box/closureConversion/mutable1.kt");
            doTest(fileName);
        }

        @TestMetadata("mutablePrimitives.kt")
        public void testMutablePrimitives() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/ir/box/closureConversion/mutablePrimitives.kt");
            doTest(fileName);
        }
    }
}
